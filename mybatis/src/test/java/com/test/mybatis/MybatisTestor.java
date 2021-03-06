package com.test.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.test.mybatis.dto.GoodsDTO;
import com.test.mybatis.entity.Goods;
import com.test.mybatis.entity.GoodsDetail;
import com.test.mybatis.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLOutput;
import java.util.*;

public class MybatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        System.out.println("SqlSessionFactory 加载成功");
        SqlSession sqlSession = null;

        try {
            sqlSession = sqlSessionFactory.openSession();
            // 测试用
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testMybatisUtils() {
        // 代码健壮性考虑，需要try catch finally
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            List<Goods> list = sqlSession.selectList("goods.selectAll");
            for (Goods goods : list) {
                System.out.println(goods.getTitle());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById", 1604);
            System.out.println(goods.getTitle());

        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectByPriceRange() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Map param = new HashMap();
            param.put("min", 100);
            param.put("max", 500);
            param.put("limt", 10);
            List<Goods> list = sqlSession.selectList("goods.selectByPriceRange", param);
            for (Goods goods : list) {
                System.out.println(goods.getTitle()+ ":" + goods.getCurrentPrice());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testSelectGoodsMap () {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            // 使用map返回数据，不知道map里面有什么数据，可能会导致出错
            List<Map> list = sqlSession.selectList("goods.selectGoodsMap");
            for(Map map : list){
                System.out.println(map);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectGoodsDTO () {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            // 使用map返回数据，不知道map里面有什么数据，可能会导致出错
            List<GoodsDTO> list = sqlSession.selectList("goods.selectGoodsDTO");
            for (GoodsDTO goodsDTO : list){
                System.out.println(goodsDTO.getGoods().getTitle());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = new Goods();
            goods.setTitle("测试商品");
            goods.setSubTitle("测试子标题");
            goods.setOriginalCost(200f);
            goods.setCurrentPrice(100f);
            goods.setDiscount(0.5f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(43);
            int insert = sqlSession.insert("goods.insert", goods);
            System.out.println(insert);
            sqlSession.commit();
            System.out.println(goods.getGoodsId());
        } catch (Exception e) {
            if(sqlSession  != null){
                sqlSession.rollback();
            }
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testUpdata(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById",739);
            goods.setTitle("更新测试商品");
            int update = sqlSession.update("goods.update", goods);
            sqlSession.commit();
        } catch (Exception e) {
            if(sqlSession  != null){
                sqlSession.rollback();
            }
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }
    /**
     * 删除数据
     * @throws Exception
     */
    @Test
    public void testDelete() throws Exception {
        SqlSession session = null;
        try{
            session = MybatisUtils.openSession();
            int num = session.delete("goods.delete" , 739);
            System.out.println(num);
            session.commit();//提交事务数据
        }catch (Exception e){
            if(session != null){
                session.rollback();//回滚事务
            }
            throw e;
        }finally {
            MybatisUtils.closeSession(session);
        }
    }
    @Test
    public  void testDynamicSQL () throws Exception {
        SqlSession session = null;
        try{
            session = MybatisUtils.openSession();
            Map param = new HashMap();
            param.put("categoryId", 44);
            param.put("currentPrice", 500);
            // 查询条件
            List<Goods> list = session.selectList("goods.dynamicSQL", param);
            for (Goods g: list){
                System.out.println(g.getTitle() + ":" + g.getCategoryId() + ":" + g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MybatisUtils.closeSession(session);
        }
    }
    @Test
    public void testLv1Cache() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById", 1604);
            Goods goods1 = sqlSession.selectOne("goods.selectById", 1604);
            System.out.println(goods.getTitle());
            System.out.println(goods.hashCode() + ":" + goods1.hashCode());
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }

        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById", 1604);
            sqlSession.commit(); // 一级缓存只在sision周期里面有，commit后就会清空
            Goods goods1 = sqlSession.selectOne("goods.selectById", 1604);
            System.out.println(goods.getTitle());
            System.out.println(goods.hashCode() + ":" + goods1.hashCode());
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testLv2Cache() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById", 1604);
            System.out.println(goods.hashCode());
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }

        try {
            sqlSession = MybatisUtils.openSession();
            Goods goods = sqlSession.selectOne("goods.selectById", 1604);
            System.out.println(goods.hashCode());
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testOneToMany() throws Exception {
        SqlSession session = null;
        try{
            session = MybatisUtils.openSession();
            List<Goods> list = session.selectList("goods.selectOneToMany");
            for (Goods goods : list){
                System.out.println(goods.getTitle() + ":" + goods.getGoodsDetailList().size());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MybatisUtils.closeSession(session);
        }
    }
    /**
     * 测试多对一对象关联映射
     */
    @Test
    public void testManyToOne() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            List<GoodsDetail> list = session.selectList("goodsDetail.selectManyToOne");
            for(GoodsDetail gd:list) {
                System.out.println(gd.getGdPicUrl());
                if(gd.getGoods() != null){
                    System.out.println(gd.getGoods().getTitle());
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void testSelectPage () throws Exception {
        SqlSession session = null;
        try{
            session = MybatisUtils.openSession();
            PageHelper.startPage(2,10);
            Page<Goods> page = (Page)session.selectList("goods.selectPage");
            System.out.println("总页数:" + page.getPages());
            System.out.println("总记录数：" + page.getTotal());
            System.out.println("开始行数:" + page.getStartRow());
            System.out.println("结束行号:" + page.getEndRow());
            System.out.println("当前页码:" + page.getPageNum());
        }catch (Exception e){
            throw  e;
        } finally {
            MybatisUtils.closeSession(session);
        }
    }
    /**
     * 10000次数据插入对比测试用例
     * @throws Exception
     */
    @Test
    public void testInsert1() throws Exception {
        SqlSession session = null;
        try{
            long st = new Date().getTime();
            session = MybatisUtils.openSession();
            List list = new ArrayList();
            for(int i = 0 ; i < 10000 ; i++) {
                Goods goods = new Goods();
                goods.setTitle("测试商品");
                goods.setSubTitle("测试子标题");
                goods.setOriginalCost(200f);
                goods.setCurrentPrice(100f);
                goods.setDiscount(0.5f);
                goods.setIsFreeDelivery(1);
                goods.setCategoryId(43);
                //insert()方法返回值代表本次成功插入的记录总数

                session.insert("goods.insert" , goods);
            }

            session.commit();//提交事务数据
            long et = new Date().getTime();
            System.out.println("执行时间:" + (et-st) + "毫秒");
//            System.out.println(goods.getGoodsId());
        }catch (Exception e){
            if(session != null){
                session.rollback();//回滚事务
            }
            throw e;
        }finally {
            MybatisUtils.closeSession(session);
        }
    }

    /**
     * 批量插入测试
     * @throws Exception
     */
    @Test
    public void testBatchInsert() throws Exception {
        SqlSession session = null;
        try {
            long st = new Date().getTime();
            session = MybatisUtils.openSession();
            List list = new ArrayList();
            for (int i = 0; i < 10000; i++) {
                Goods goods = new Goods();
                goods.setTitle("测试商品");
                goods.setSubTitle("测试子标题");
                goods.setOriginalCost(200f);
                goods.setCurrentPrice(100f);
                goods.setDiscount(0.5f);
                goods.setIsFreeDelivery(1);
                goods.setCategoryId(43);
                //insert()方法返回值代表本次成功插入的记录总数

                list.add(goods);
            }
            session.insert("goods.batchInsert", list);
            session.commit();//提交事务数据
            long et = new Date().getTime();
            System.out.println("执行时间:" + (et - st) + "毫秒");
//            System.out.println(goods.getGoodsId());
        } catch (Exception e) {
            if (session != null) {
                session.rollback();//回滚事务
            }
            throw e;
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    /**
     * 批量删除测试
     * @throws Exception
     */
    @Test
    public void testBatchDelete() throws Exception {
        SqlSession session = null;
        try {
            long st = new Date().getTime();
            session = MybatisUtils.openSession();
            List list = new ArrayList();
            list.add(1920);
            list.add(1921);
            list.add(1922);
            session.delete("goods.batchDelete", list);
            session.commit();//提交事务数据
            long et = new Date().getTime();
            System.out.println("执行时间:" + (et - st) + "毫秒");
//            System.out.println(goods.getGoodsId());
        } catch (Exception e) {
            if (session != null) {
                session.rollback();//回滚事务
            }
            throw e;
        } finally {
            MybatisUtils.closeSession(session);
        }
    }
}

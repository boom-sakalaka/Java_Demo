package com.test.mybatis;

import com.test.mybatis.dto.GoodsDTO;
import com.test.mybatis.entity.Goods;
import com.test.mybatis.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}

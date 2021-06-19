package com.test.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

public class MybatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        System.out.println("SqlSessionFactory 加载成功");
        SqlSession sqlSession = null;

       try{
           sqlSession = sqlSessionFactory.openSession();
           // 测试用
           Connection connection = sqlSession.getConnection();
           System.out.println(connection);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           if(sqlSession != null){
               sqlSession.close();
           }
       }
    }
}

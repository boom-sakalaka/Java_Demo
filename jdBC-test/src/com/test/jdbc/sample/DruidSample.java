package com.test.jdbc.sample;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.test.jdbc.common.DbUtils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Druid 连接池配置与使用
 */
public class DruidSample {
    public static void main(String[] args) {
        // 1. 加载属性文件
        Properties properties = new Properties();
       String propertyFile =  DruidSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2. 获取DataSource 数据源对象
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            DataSource dataSource =  DruidDataSourceFactory.createDataSource(properties);
            // 3. 创建数据库连接
             conn = dataSource.getConnection();
             pstmt = conn.prepareStatement("select * from employee limit 0,10");
             rs = pstmt.executeQuery();

            // 4. 遍历查询结果
            while (rs.next()) {
                Integer eno = rs.getInt(1);
                String e_name = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String d_name = rs.getString("dname");
                System.out.println(d_name + "-" + eno + "-" + e_name + "-" + salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeConnection(rs,pstmt,conn);
        }
    }
}

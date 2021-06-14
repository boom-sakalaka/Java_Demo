package com.test.jdbc.sample;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.test.jdbc.hrapp.entity.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import javax.sql.DataSource;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * Apache DBUtils + Druid 联合使用演示
 */
public class DbutilsSample {
    private static void query() {
        Properties properties = new Properties();
        String propertyFile = DbutilsSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            QueryRunner qr = new QueryRunner(dataSource);
            List<Employee> list =  qr.query("select * from employee limit ?,10",
                    new BeanListHandler<>(Employee.class),
                    new Object[]{10});
            for (int i = 0; i < list.size(); i++) {
                Employee employee =  list.get(i);
                System.out.println(employee.getEname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  static  void update () {
        Properties properties = new Properties();
        String propertyFile = DbutilsSample.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            String sql1 = "update employee set salary=salary+1000 where eno=?";
            String sql2 = "update employee set salary=salary-1000 where eno=?";

            QueryRunner qr = new QueryRunner();
            qr.update(conn, sql1,new Object[]{1000});
            qr.update(conn, sql2,new Object[]{1001});
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn !=null && !conn.isClosed()){
                    conn.rollback();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            try {
                if(conn !=null && !conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        //query();
        update();
    }
}

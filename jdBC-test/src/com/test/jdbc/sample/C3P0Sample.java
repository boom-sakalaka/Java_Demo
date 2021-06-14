package com.test.jdbc.sample;

import com.test.jdbc.common.DbUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Sample {
    public static void main(String[] args) {
        //1. 加载配置文件
        //2. 创建DataSource
        DataSource dataSource = new ComboPooledDataSource();
        //3. 得到数据库连接
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement("select * from employee limit 0,10");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Integer eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                String dname = rs.getString("dname");
                Float salary = rs.getFloat("salary");
                System.out.println(dname + "-" + eno + "-" + ename  + "-" + salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeConnection(rs,pstmt,conn);
        }
    }
}

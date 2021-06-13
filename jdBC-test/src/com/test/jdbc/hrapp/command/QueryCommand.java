package com.test.jdbc.hrapp.command;

import java.sql.*;
import java.util.Scanner;

public class QueryCommand implements Command {
    @Override
    public void execute() {
        System.out.println("请输入部门名称");
        Scanner in = new Scanner(System.in);
        String pdname = in.nextLine();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1.加载并注册JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 创建数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                    "root", "root");
            // 3. 创建Statement对象
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from employee where dname='" + pdname + "'");
            System.out.println("select * from employee where dname='" + pdname + "'");
            // 4. 遍历查询结果
            while (rs.next()) {
                int eno = rs.getInt(1);
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(dname + "-" + eno + "-" + ename + "-" + salary);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. 关闭连接，释放资源
            try {
                if(rs !=null){
                    rs.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(conn !=null && !conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}

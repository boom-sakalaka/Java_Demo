package com.test.jdbc.hrapp.command;

import java.sql.*;
import java.util.Scanner;

public class PstmtQueryCommand implements Command {
    @Override
    public void execute() {
        System.out.println("请输入部门名称");
        Scanner in = new Scanner(System.in);
        String pdname = in.nextLine();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            // 1.加载并注册JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 创建数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                    "root", "root");
            // 3. 创建Statement对象
            String sql = "select * from employee where dname=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pdname);
            rs = pstmt.executeQuery();
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("select * from employee where dname='" + pdname + "'");
//            System.out.println("select * from employee where dname='" + pdname + "'");
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
                if (rs != null) {
                    rs.close();
                }

                if (pstmt != null) {
                    pstmt.close();
                }
         
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}

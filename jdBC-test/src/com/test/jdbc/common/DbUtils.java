package com.test.jdbc.common;

import java.sql.*;

public class DbUtils {
    /**
     * 创建新的数据库连接
     * @return 新的Connection对象
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // 1.加载并注册JDBC 驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 创建数据库连接
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "root");
        return  conn;
    }

    /**
     * 关闭连接,释放资源
     * @param rs 结果集对象
     * @param stmt Statement 对象
     * @param conn Connection 对象
     */
    public static void closeConnection(ResultSet rs, Statement stmt,Connection conn){
        try{
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

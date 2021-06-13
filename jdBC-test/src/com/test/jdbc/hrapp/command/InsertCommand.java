package com.test.jdbc.hrapp.command;

import com.test.jdbc.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 新增员工数据
 */
public class InsertCommand implements Command {

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工编号:");
        int eno = in.nextInt();
        System.out.println("请输入员工姓名:");
        String ename = in.next();
        System.out.println("请输入员工薪资:");
        float salary = in.nextFloat();
        System.out.println("请输入隶属部门:");
        String dname = in.next();

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "insert into employee(eno,ename,salary,dname) value (?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, eno);
            pstmt.setString(2, ename);
            pstmt.setFloat(3, salary);
            pstmt.setString(4, dname);
            int cnt = pstmt.executeUpdate();
            System.out.println("cnt:" + cnt);
            System.out.println(ename + " 员工入职手续已办理");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeConnection(null,pstmt,conn);
        }
    }
}

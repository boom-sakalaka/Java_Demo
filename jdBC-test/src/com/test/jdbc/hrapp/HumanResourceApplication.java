package com.test.jdbc.hrapp;

import com.test.jdbc.hrapp.command.Command;
import com.test.jdbc.hrapp.command.PstmtQueryCommand;
//import com.test.jdbc.hrapp.command.QueryCommand;

import java.util.Scanner;

public class HumanResourceApplication {
    public static void main(String[] args) {
        System.out.println("1-查询部门员工");
        Scanner in = new Scanner(System.in);
        Integer cmd = in.nextInt();
        switch (cmd) {
            case 1:
                Command command = new PstmtQueryCommand();
                command.execute();
                break;
        }
    }
}

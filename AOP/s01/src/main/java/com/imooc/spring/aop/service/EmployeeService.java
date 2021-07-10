package com.imooc.spring.aop.service;

import com.imooc.spring.aop.dao.EmployeeDao;

import java.util.Date;

/**
 * 员工服务
 */
public class EmployeeService {
    private EmployeeDao employeeDao;
    public void entry(){
        System.out.println("执行员工入职业务逻辑");
        employeeDao.insert();
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}

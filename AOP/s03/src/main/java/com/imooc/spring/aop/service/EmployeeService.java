package com.imooc.spring.aop.service;

import com.imooc.spring.aop.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 员工服务
 */
@Service
public class EmployeeService {
    @Resource
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

package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;

public interface DepartmentDao {
    public Department selectById(Long departmentId);
}

package com.imooc.oa.service;

import com.imooc.oa.dao.DepartmentDao;
import com.imooc.oa.entity.Department;
import com.imooc.oa.utils.MybatisUtils;

/**
 * 部门服务
 */
public class DepartmentService {
    /**
     * 按编号得到部门对象
     * @param departmentId 部门编号
     * @return 部门对象,null代表部门不存在
     */
    public Department selectById(Long departmentId){
        return (Department) MybatisUtils.executeQuery(
                sqlSession -> sqlSession.getMapper(DepartmentDao.class).selectById(departmentId)
        );
    }
}

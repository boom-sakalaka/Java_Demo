package com.imooc.oa.dao;

import com.imooc.oa.entity.ProcessFlow;

import java.util.List;

public interface ProcessFlowDao {
    public void insert(ProcessFlow processFlow);

    public void update(ProcessFlow processFlow);

    public List<ProcessFlow> selectByFormId(Long formId);
}

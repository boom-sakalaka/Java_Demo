package com.imooc.oa.dao;

import com.imooc.oa.entity.Notice;

import java.util.List;

public interface NoticeDao {
    public void insert(Notice notice);

    public List<Notice> selectByReceiverId(Long receiverId);
}

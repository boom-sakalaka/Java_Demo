package com.io.spring.ioc.bookshop.dao;

public class BookDaoImpl implements  BookDao{
    public void insert() {
        System.out.println("向Mysql Book 表插入一条数据");
    }
}

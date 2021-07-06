package com.io.spring.ioc;

import com.io.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple apple4 = context.getBean("apple4", Apple.class);
        System.out.println(apple4.getTitle());
    }
}

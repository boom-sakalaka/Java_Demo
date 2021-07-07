package com.io.spring.ioc;

import com.io.spring.ioc.context.ApplicationContext;
import com.io.spring.ioc.context.ClassPathXmlApplicationContext;
import com.io.spring.ioc.entity.Apple;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Apple apple = (Apple)context.getBean("sweetApple");
        System.out.println(apple);
    }
}

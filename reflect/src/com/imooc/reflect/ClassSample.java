package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            // Class.forName 方法将指定的类加载带JVM 中,并返回对应的Class 对象
            Class employeeClass =   Class.forName("com.imooc.reflect.entity.Employee");
            System.out.println("Employee已经被加载到jvm");
             Employee employee = (Employee) employeeClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

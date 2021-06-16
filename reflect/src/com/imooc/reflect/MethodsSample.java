package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodsSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor =  employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee1 = (Employee) constructor.newInstance(new Object[] {
                    100,"李磊",3000f,"研发部"
            });
           Method method =  employeeClass.getMethod("updateSalary", Float.class);
            Employee employee2 =(Employee) method.invoke(employee1, new Object[]{1000f});
            System.out.println(employee2);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

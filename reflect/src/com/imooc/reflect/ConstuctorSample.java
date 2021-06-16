package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstuctorSample {
    public static void main(String[] args) {
        Class emp = null;
        try {
            emp = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor =  emp.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee1 = (Employee) constructor.newInstance(new Object[] {
                    100,"李磊",3000f,"研发部"
            });
            System.out.println(employee1);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

package com.imooc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.imooc.comparable.Employee;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1,"张三",1800.0);
		Employee emp2 = new Employee(2,"李四",2500.0);
		Employee emp3 = new Employee(3,"王五",1600.0);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("排序前");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		Collections.sort(list);
		System.out.println("排序后");
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}

}

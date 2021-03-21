package com.imooc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.imooc.comparator.NameComparator;
import com.imooc.comparator.Student;

public class ComparatorTest {
	public static void main(String [] args ) {
		List<Student> list = new ArrayList();
		
		Student st1 = new Student(40,"peter",20);
		Student st2 = new Student(28,"angel",5);
		Student st3 = new Student(35,"tom",18);
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		System.out.println("≈≈–Ú«∞");
		for(Student st: list) {
			System.out.println(st);
		}
		System.out.println("≈≈–Ú∫Û");
		Collections.sort(list,new NameComparator());
		for(Student st: list) {
			System.out.println(st);
		}
	}
}

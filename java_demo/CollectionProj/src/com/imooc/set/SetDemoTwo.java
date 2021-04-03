package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemoTwo {
	public static void main (String [] args) {
		Set<Student> set = new HashSet<Student>();
		
		// ����ѧ������
		Student st1 = new Student(1,"Tom", 87);
		Student st2 = new Student(2,"Lucy", 95);
		Student st3 = new Student(3,"William", 65);
		
		set.add(st1);
		set.add(st2);
		set.add(st3);
		
		// ��ʾset��Ԫ��
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ����ظ�����
		Student st4 = new Student(3,"William", 65);
		set.add(st4);
		// ����ظ����ݺ����
		System.out.println("================================");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}

package com.imooc.test;
import com.imooc.model.*;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sbu1 = new Subject("�������ѧ��Ӧ��","Jooo1",-4);
		System.out.println(sbu1.info());
		
		Student st1 = new Student("001", "Tom" , "��2", 15);
		System.out.println(st1.info());
		Student st2 = new Student("002", "jon" , "��1", 14);
		System.out.println(st2.info());
	}

}

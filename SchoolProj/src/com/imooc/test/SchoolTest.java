package com.imooc.test;
import com.imooc.model.*;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Subject sbu1 = new Subject("�������ѧ��Ӧ��","Jooo1",4);
//		System.out.println(sbu1.info());
//		System.out.println("==============================");
		Student st1 = new Student("001", "Tom" , "����", 15);
//		System.out.println(st1.info());
		Student st2 = new Student("002", "jon" , "��1", 14);
//		System.out.println(st2.info("�������ѧ�뼼��", "4"));
		Student st3 = new Student("002", "jon" , "��1", 14);
//		System.out.println(st3.info(sbu1));
		
		Subject sbu1 = new Subject("�������ѧ��Ӧ��","Jooo1",4);
		sbu1.addStudent(st1);
		sbu1.addStudent(st2);
//		sbu1.addStudent(st3);
		System.out.println("�������ѧ��Ӧ����" + sbu1.getStudentNum() +"�˱���");
	}

}
 
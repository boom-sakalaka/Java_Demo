package com.imooc.test;
import com.imooc.model.*;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sbu1 = new Subject("计算机科学与应用","Jooo1",4);
		System.out.println(sbu1.info());
		System.out.println("==============================");
		Student st1 = new Student("001", "Tom" , "不详", 15,sbu1);
		System.out.println(st1.info());
//		Student st2 = new Student("002", "jon" , "男1", 14);
//		System.out.println(st2.info("计算机科学与技术", "4"));
//		Student st3 = new Student("002", "jon" , "男1", 14);
//		System.out.println(st3.info(sbu1));
	}

}

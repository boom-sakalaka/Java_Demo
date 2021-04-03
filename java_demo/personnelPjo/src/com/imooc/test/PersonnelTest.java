package com.imooc.test;

import com.imooc.model.*;

public class PersonnelTest {
	public static void main(String [] args) {
		// 创建部门实例
		Department dm1 = new Department("D001","人事部");
		Department dm2 = new Department("D002","市场部");
		
		// 创建职务实例
		Title te1 = new Title("P001","经理");
		Title te2 = new Title("P002","助理");
		Title te3 = new Title("P003","职员");
		
		// 创建员工实例
		Staff st1 = new Staff("S001","张铭","男", 29, dm1,te1);
		Staff st2 = new Staff("S002","李艾爱","女",21,dm1,te2);
		Staff st3 = new Staff("S003","孙超","男",29,dm1,te3);
		Staff st4 = new Staff("S004","张美美","女",26,dm2,te3);
		Staff st5 = new Staff("S005","蓝迪","男",37,dm2,te1);
		Staff st6 = new Staff("S005","米莉","女",24,dm2,te3);
		
		
		//为部门添加职员
		
		// 人事部
		dm1.addDepartmentMenber(st1);
		dm1.addDepartmentMenber(st2);
		dm1.addDepartmentMenber(st3);
		// 市场部
		dm2.addDepartmentMenber(st4);
		dm2.addDepartmentMenber(st5);
		dm2.addDepartmentMenber(st6);
		
		// 信息展示 方法 一
		System.out.println(st1.introduction());
		System.out.println("======================");
		System.out.println(st2.introduction());
		System.out.println("======================");
		System.out.println(st3.introduction());
		System.out.println("======================");
		System.out.println(st4.introduction());
		System.out.println("======================");
		System.out.println(st5.introduction());
		System.out.println("======================");
		System.out.println(st6.introduction());
		System.out.println("======================");
		System.out.println(dm1.showDepartmentNumInfo());
		System.out.println(dm2.showDepartmentNumInfo());
		
		// 信息展示 方法二
//		System.out.println(dm1.introduction());
//		System.out.println(dm2.introduction());
//		System.out.println(dm1.showDepartmentNumInfo());
//		System.out.println(dm2.showDepartmentNumInfo());
	}
}

package com.imooc.test;

import com.imooc.model.*;

public class PersonnelTest {
	public static void main(String [] args) {
		// ��������ʵ��
		Department dm1 = new Department("D001","���²�");
		Department dm2 = new Department("D002","�г���");
		
		// ����ְ��ʵ��
		Title te1 = new Title("P001","����");
		Title te2 = new Title("P002","����");
		Title te3 = new Title("P003","ְԱ");
		
		// ����Ա��ʵ��
		Staff st1 = new Staff("S001","����","��", 29, dm1,te1);
		Staff st2 = new Staff("S002","���","Ů",21,dm1,te2);
		Staff st3 = new Staff("S003","�ﳬ","��",29,dm1,te3);
		Staff st4 = new Staff("S004","������","Ů",26,dm2,te3);
		Staff st5 = new Staff("S005","����","��",37,dm2,te1);
		Staff st6 = new Staff("S005","����","Ů",24,dm2,te3);
		
		
		//Ϊ�������ְԱ
		
		// ���²�
		dm1.addDepartmentMenber(st1);
		dm1.addDepartmentMenber(st2);
		dm1.addDepartmentMenber(st3);
		// �г���
		dm2.addDepartmentMenber(st4);
		dm2.addDepartmentMenber(st5);
		dm2.addDepartmentMenber(st6);
		
		// ��Ϣչʾ ���� һ
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
		
		// ��Ϣչʾ ������
//		System.out.println(dm1.introduction());
//		System.out.println(dm2.introduction());
//		System.out.println(dm1.showDepartmentNumInfo());
//		System.out.println(dm2.showDepartmentNumInfo());
	}
}

package com.imooc.list;

import java.util.ArrayList;

public class ListDemo1 {

	public static void main(String[] args) {
		// ��ArrayList �洢����
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("swift");
		
		// ����б���Ԫ�صĸ���
		System.out.println("�б���Ԫ�صĸ���Ϊ:" + list.size());
		
		// ����������еı������
		System.out.println("==========================");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "====");
		}
		
		
		// �Ƴ� C++
		list.remove(2);
		//list.remove("C++");
		System.out.println("==========================");
		System.out.println("�Ƴ�C++���ݺ�");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "====");
		}
		
	}

}

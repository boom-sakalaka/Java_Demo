package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String [] args) {
		Set set = new HashSet();
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		
		// �����в����µĵ���
		set.add("green");
		
		// �����ظ�Ԫ�� ����������Ҳ�����ٴ����
		set.add("green");
		
		// ��ʾ��������
		System.out.println("��ʾ����������");
		Iterator it = set.iterator();
		// ����������
		while(it.hasNext()) {
			System.out.print(it.next() + "    ");
		}
	}
}

package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {
	public static void main (String [] args) {
		Map<String,String> animal = new HashMap<String,String>();
		
		System.out.println("���������鵥�ʶ�Ӧ��ע�ͣ����浽hashMap��ȥ");
		Scanner sc = new Scanner(System.in);
		// �������
		int i = 0;
		while(i < 3) {
			System.out.println("������key(����)ֵ:");
			String key = sc.next();
			System.out.println("������value(ע��)ֵ:");
			String value = sc.next();
			animal.put(key,value);
			i++;
		}
		
		System.out.println("*************************");
		System.out.println("ʹ�õ�����������е�value");
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "   ");
		}
		
		System.out.println("*************************");
		System.out.println("��ӡkey��value��ֵ");
		// entryset����
		Set<Entry<String,String>> entrySet = animal.entrySet();
		
		for(Entry<String,String> entry : entrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "    ");
		}
		
		
	}
}

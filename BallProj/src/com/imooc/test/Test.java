package com.imooc.test;

import com.imooc.ball.Person;

public class Test {
	public static void main(String [] arg) {
		Person lili = new Person();
		lili.age = 12;
		// ��ȡ�ڲ������ʵ�� ��ʽ
		
		// ��һ�ַ�ʽ new �ⲿ��.new �ڲ���
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		// �ڶ��ַ�ʽ ʵ��
		
		System.out.println(lili.new Heart().beat());
		
		// �����ַ�ʽ
		System.out.println(lili.getHeart().beat());
	}
}

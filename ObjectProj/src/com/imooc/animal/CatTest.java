package com.imooc.animal;

public class CatTest {
	public static void main(String [] args) {
		// ����ʵ����
		Cat one = new Cat("����",2,1000,"����");
		System.out.println(one.name);
		System.out.println(one.weight);
		System.out.println(one.species);
		System.out.println(one.month);
		// ���÷���
		one.run();
		one.eat();
	}
}

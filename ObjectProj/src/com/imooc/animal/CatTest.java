package com.imooc.animal;

public class CatTest {
	public static void main(String [] args) {
		// ����ʵ����
		Cat one = new Cat();
		one.name = "����";
		one.month = 2;
		one.weight = 1000;
		// ���÷���
		one.run();
		one.eat();
		System.out.println(one.test);
	}
}

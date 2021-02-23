package com.imooc.animal;

public class CatTest {
	public static void main(String [] args) {
		// 对象实例化
		Cat one = new Cat();
		one.name = "花花";
		one.month = 2;
		one.weight = 1000;
		// 调用方法
		one.run();
		one.eat();
		System.out.println(one.test);
	}
}

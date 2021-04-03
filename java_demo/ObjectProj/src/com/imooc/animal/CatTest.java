package com.imooc.animal;

public class CatTest {
	public static void main(String [] args) {
		// 对象实例化
		Cat one = new Cat("花花",2,1000,"花短");
		System.out.println(one.name);
		System.out.println(one.weight);
		System.out.println(one.species);
		System.out.println(one.month);
		// 调用方法
		one.run();
		one.eat();
	}
}

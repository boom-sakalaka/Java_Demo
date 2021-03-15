package com.imooc.test;

import com.imooc.ball.Person;

public class Test {
	public static void main(String [] arg) {
		Person lili = new Person();
		lili.age = 12;
		// 获取内部类对象实例 方式
		
		// 第一种方式 new 外部类.new 内部类
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		// 第二种方式 实例
		
		System.out.println(lili.new Heart().beat());
		
		// 第三种方式
		System.out.println(lili.getHeart().beat());
	}
}

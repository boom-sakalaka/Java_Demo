package com.imooc.ball;
// 外部类 
public class Person {
	public int age;
	public Heart getHeart() {
		return new Heart();
	}
	
	// 成员内部类
	public class Heart {
		public String beat() {
			return Person.this.age + "岁的心脏在跳动";
		}
	}
}

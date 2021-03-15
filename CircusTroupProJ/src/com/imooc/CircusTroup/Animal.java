package com.imooc.CircusTroup;

public abstract class Animal {
	// 成员属性 名字 年龄
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name,int age) {
		this.setAge(age);
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// 做一下校验
		if(age <= 0) {
			age = 1;
		}
		this.age = age;
	}
	
	// 定义抽象方法
	public abstract String love();
	
}

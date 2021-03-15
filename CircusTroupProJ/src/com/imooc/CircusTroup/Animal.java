package com.imooc.CircusTroup;

public abstract class Animal {
	// ��Ա���� ���� ����
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
		// ��һ��У��
		if(age <= 0) {
			age = 1;
		}
		this.age = age;
	}
	
	// ������󷽷�
	public abstract String love();
	
}

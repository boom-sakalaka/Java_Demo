package com.imooc.animal;

public class Dog extends Animal {
	private String sex; // 性别
	
	public Dog() {}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// 睡觉的方法
	public void sleep () {
		System.out.println(this.getName() + "现在" + this.getMonth()
		+ "个月大，它在睡觉~~~~~~");
	}
	
}

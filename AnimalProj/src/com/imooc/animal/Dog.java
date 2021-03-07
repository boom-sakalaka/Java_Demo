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
	
	/**
	 * 方法重载:
	 * 1.同一个类中
	 * 2.方法名相同,参数列表不同(参数顺序 、个数、类型)
	 * 3.方法返回值、访问修饰符随意
	 * 4.与方法的参数名字无关
	 * 
	 * 
	 * 方法重写:
	 * 1.有继承关系的子类中
	 * 2.方法名相同，参数列表相同(参数顺序 、个数、类型)
	 * 3.与方法的参数名字无关
	 * 4.方法返回值 :当方法返回值是void或者基本数据类型时，必须相同；当返回值是引用类型时，
	 * 可以是其父类或其子类
	 */
	
//	public void sleep(String str) {
//		
//	}
//	
//	public String sleep(int str) {
//		return "";
//	}
	
	public void eat() {
		System.out.println( this.getName() +"最近没有食欲");
	}
	
	public void eat(String name) {
		System.out.println( name +"最近没有食欲");
	}
	
	public String eat(int age) {
		return "";
	}
	
}

package com.imooc.animal;
/**
 * 宠物猫类
 * @author GZH
 *
 */
public class Cat {
	// 成员属性 ： 昵称 年龄 体重 品种
	String name;
	int month;
	double weight;
	String species;
	
	public Cat (String name,int month,double weight,String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}
	
	// 方法： 跑动、吃东西
	public void run () {
		System.out.println( this.name +"小猫快跑");
	}
	
	public void eat () {
		System.out.println("小猫吃鱼");
	}
	
	
}

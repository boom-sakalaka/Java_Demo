package com.imooc.animal;

public class Cat extends Animal{
	private double weight; // 体重
	
	public Cat() {}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// 跑动
	public void run () {
		System.out.println(this.getName() 
				+ "是一只" + this.getSpecies()
				+ "，它在快乐的奔跑");
	}
}

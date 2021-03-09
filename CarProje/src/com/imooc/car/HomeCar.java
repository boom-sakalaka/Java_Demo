package com.imooc.car;

public final class HomeCar extends Car {
	//私有属性：载客数（num）

	private int num;
	
	public HomeCar () {}
	//带参构造方法为所有属性赋值
	public HomeCar (String color,String userName, int num) {
		super(color,userName);
		this.setNum(num);
	}
	//通过封装实现对私有属性的get/set操作
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	   
	//创建无参无返回值的display方法，表现为：**拥有的**颜色的私家车,有**座位
	public void display() {
		System.out.println( this.getUserName() +"拥有的"+ this.getColor() +"颜色的私家车，有"+ this.getNum() +"个座位");
	}

	//重载display方法（带参数num），描述为：家用汽车大多有**个座位
	public void display(int num) {
		System.out.println("家用汽车大多有"+ num +"个座位");
	}
}

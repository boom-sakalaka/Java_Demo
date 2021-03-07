package com.imooc.model;

public final class Waxberry extends Fruits {
	private String color;
	
	public Waxberry(String shape,String taste,String color) {
		super(shape,taste);
		this.setColor(color);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 重写父类的eat方法
	public void eat() {
		System.out.println("杨梅酸甜适中，非常好吃!");
	}
	
	//不允许重写的face方法
	public final String face () {
		return "杨梅：" + this.getColor() + "、" + this.getShape()+ "，果味"+ this.getTaste();
	}
	
	
	// 重写 toString 方法
	public String toString() {
		return "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() + "，" + this.getTaste()  + "，非常好吃";
	}
}

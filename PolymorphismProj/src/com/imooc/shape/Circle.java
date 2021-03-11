package com.imooc.shape;

public class Circle extends Shape {
	private double r;
	
	public Circle() {}
	
	public Circle(double r) {
		this.setR(r);
	}
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积为:" + (Math.PI * this.getR() * this.getR()));
	}

}

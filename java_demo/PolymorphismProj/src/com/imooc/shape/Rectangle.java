package com.imooc.shape;

public class Rectangle extends Shape {
	private double length;
	private double wide;
	
	public Rectangle() {}
	public Rectangle(double length,double wide) {
		this.setLength(length);
		this.setWide(wide);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("矩形的面积为:" + (this.getLength() * this.getWide()));
	}

}

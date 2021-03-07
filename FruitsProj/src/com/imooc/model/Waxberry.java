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
	
	// ��д�����eat����
	public void eat() {
		System.out.println("��÷�������У��ǳ��ó�!");
	}
	
	//��������д��face����
	public final String face () {
		return "��÷��" + this.getColor() + "��" + this.getShape()+ "����ζ"+ this.getTaste();
	}
	
	
	// ��д toString ����
	public String toString() {
		return "��÷����Ϣ����ʵΪ" + this.getShape() + "��" + this.getColor() + "��" + this.getTaste()  + "���ǳ��ó�";
	}
}

package com.imooc.model;

public class Bicycle extends NonMotor {
	 // �ڹ��췽���е��ø����ι��죬������Ը�ֵ
	public Bicycle(String brand,String color) {
		super(brand,color);
	}
	// ��д���з�������������Ϊ������һ��**��ɫ�ģ�**�Ƶ����г�������**�������������ṩ
	public String work () {
			String str = "���һ��" 
				+ this.getColor() + "�ģ�"
				+ this.getBrand() +"�Ƶ����г���";
		return str;
	}
}

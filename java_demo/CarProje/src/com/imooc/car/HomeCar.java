package com.imooc.car;

public final class HomeCar extends Car {
	//˽�����ԣ��ؿ�����num��

	private int num;
	
	public HomeCar () {}
	//���ι��췽��Ϊ�������Ը�ֵ
	public HomeCar (String color,String userName, int num) {
		super(color,userName);
		this.setNum(num);
	}
	//ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	   
	//�����޲��޷���ֵ��display����������Ϊ��**ӵ�е�**��ɫ��˽�ҳ�,��**��λ
	public void display() {
		System.out.println( this.getUserName() +"ӵ�е�"+ this.getColor() +"��ɫ��˽�ҳ�����"+ this.getNum() +"����λ");
	}

	//����display������������num��������Ϊ���������������**����λ
	public void display(int num) {
		System.out.println("�������������"+ num +"����λ");
	}
}

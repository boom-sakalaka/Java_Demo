package com.imooc.model;

public class Banana extends Fruits {
	private  String variety;
	
	public Banana () {}
	
	public Banana (String shape,String taste,String variety) {
		super(shape,taste);
		this.setVariety(variety);
	}
	
	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
	
	public void advantage() {
		System.out.println( this.getVariety() +"����"+ this.getShape() +"���������𣬿ɹ���ʳ��");
	}
	public void advantage(String color) {
		System.out.println( this.getVariety() +"��ɫΪ" + color);
	}
}

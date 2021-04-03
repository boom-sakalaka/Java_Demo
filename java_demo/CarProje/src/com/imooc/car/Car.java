package com.imooc.car;

public class Car {
    //���ԣ�������ɫcolor����������userName
	private String color;
	private String userName;

	public Car(){
		
	}
	//���ι��캯��������Ϊcolor��userName��
	public Car(String color,String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}
	

    //ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
    //�����޲��޷���ֵ�÷���use����������Ϊ�����ǻ���������
	public void use() {
		System.out.println("���ǻ�����!");
	}

	//��дequals�������Ƚ����������Ƿ���ȣ��Ƚ�color��userName��
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Car temp = (Car)obj;
		if(this.getColor().equals(temp.getColor()) 
				&& this.getUserName().equals(temp.getUserName())) {
			return true;
		}else {
			return false;
		}
	}
}

package com.imooc.model;

public class ElectricVehicle extends NonMotor {
	// ˽�����ԣ����Ʒ��
	private String battery;
	
	public ElectricVehicle(String battery) {
		this.setBattery(battery);
	}
    // ���е�get***/set***����������Է�װ

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	// ��д���з�������������Ϊ������һ��ʹ��**�Ƶ�صĵ綯��������**�������������ṩ
	public String work () {
		String str = "����һ��ʹ��"+ this.getBattery() +"�Ƶ�صĵ綯��";
		return str;
	}
}

package com.imooc.test;

import com.imooc.model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonMotor nm = new NonMotor("����","����ɫ",4,2);
		System.out.println(nm.work());
		Bicycle bc = new Bicycle("�ݰ���","����ɫ");
		System.out.println(bc.work());
		ElectricVehicle ele = new ElectricVehicle("�ɸ�");
		System.out.println(ele.work());
		Tricycle tcle = new Tricycle();
		System.out.println(tcle.work());
	}

}

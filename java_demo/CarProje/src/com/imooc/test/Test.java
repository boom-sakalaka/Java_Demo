package com.imooc.test;

import com.imooc.car.*;

public  class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("�ڰ�","�غ�");
		Car car2 = new Car("�ڰ�","�غ�");
		
		Taxi taxi = new Taxi("��ɫ", "��СȪ", "������˾");
		
		HomeCar hc = new HomeCar("��ɫ","�����" , 7);
		
		car1.use();
		System.out.println("car1��car2�����ñȽϣ�" + car1.equals(car2));
		System.out.println("===============================");
		taxi.ride();
		taxi.use();
		System.out.println(taxi.toString());
		System.out.println("===============================");
		hc.display();
		hc.display(5);
	}

}

package com.imooc.test;

import com.imooc.car.*;

public  class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("黑白","拓海");
		Car car2 = new Car("黑白","拓海");
		
		Taxi taxi = new Taxi("蓝色", "张小泉", "长生公司");
		
		HomeCar hc = new HomeCar("紫色","孙二娘" , 7);
		
		car1.use();
		System.out.println("car1和car2的引用比较：" + car1.equals(car2));
		System.out.println("===============================");
		taxi.ride();
		taxi.use();
		System.out.println(taxi.toString());
		System.out.println("===============================");
		hc.display();
		hc.display(5);
	}

}

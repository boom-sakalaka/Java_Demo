package com.imooc.test;

import com.imooc.model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonMotor nm = new NonMotor("天宇","红颜色",4,2);
		System.out.println(nm.work());
		Bicycle bc = new Bicycle("捷安特","黄颜色");
		System.out.println(bc.work());
		ElectricVehicle ele = new ElectricVehicle("飞鸽");
		System.out.println(ele.work());
		Tricycle tcle = new Tricycle();
		System.out.println(tcle.work());
	}

}

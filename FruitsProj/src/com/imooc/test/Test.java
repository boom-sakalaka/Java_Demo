package com.imooc.test;

import com.imooc.model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fru1 = new Fruits("圆形","软软的");
		Fruits fru2 = new Fruits("圆形","软软的");
		fru1.eat();
		System.out.println("fru1和fru2的引用比较" + fru1.equals(fru2));
		System.out.println("=======================================");
		
		Waxberry wb1 = new Waxberry("圆形", "酸甜适中", "紫红色");
		System.out.println(wb1.face());
		wb1.eat();
		System.out.println(wb1.toString());
		System.out.println("=======================================");
		Banana ba = new Banana("短而稍圆", "香甜", "仙人蕉");
		ba.advantage();
		ba.advantage("黄色");
		
	}

}

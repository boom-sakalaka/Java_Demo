package com.imooc.test;

import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {
	public static void main(String [] args) {
		Cat one  = new Cat();
		one.setName("����");
		one.setSpecies("�л���԰è");
		one.eat();
		one.run();
		System.out.println("=================");
		Dog two = new Dog();
		two.setName("��");
		two.setMonth(1);
		two.eat();
		two.sleep();
	}
	
}

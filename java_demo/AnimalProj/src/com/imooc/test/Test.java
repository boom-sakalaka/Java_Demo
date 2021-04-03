package com.imooc.test;

import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {
	public static void main(String [] args) {
		Cat one  = new Cat();
		one.setName("»¨»¨");
		one.setSpecies("ÖÐ»ªÌïÔ°Ã¨");
		one.eat();
		one.run();
		System.out.println("=================");
		Dog two = new Dog();
		two.setName("æ¤æ¤");
		two.setMonth(1);
		two.eat();
		System.out.println("=================");
		two.eat("¹·¹·");
		two.sleep();
	}
	
}

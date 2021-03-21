package com.imooc.test;

import java.util.ArrayList;
import java.util.List;

import com.imooc.animal.*;

public class AnimalTest {
	public static void main(String [] args) {
		List<Dog> dg = new ArrayList<Dog>();
		Dog dog1 = new Dog("°ÍµÏ");
		Dog dog2 = new Dog("¶¹¶¹");
		dg.add(dog1);
		dg.add(dog2);
		
		List<Cat> ct = new ArrayList<Cat>();
		Cat cat1 = new Cat("»¨»¨");
		Cat cat2 = new Cat("·²·²");
		ct.add(cat1);
		ct.add(cat2);
		
		AnimalPlay ap = new AnimalPlay();
		ap.toPlay(dg);
		ap.toPlay(ct);
	}
}

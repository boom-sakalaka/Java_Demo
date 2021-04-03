package com.imooc.test;

import com.imooc.IFly.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFly plane = new Plane();
		IFly bird = new Bird();
		IFly balloon = new Balloon();
		plane.fly();
		bird.fly();
		balloon.fly();
	}

}

package com.imooc.test;

import com.imooc.singleton.SingletonTwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTwo st = SingletonTwo.getInstance();
		SingletonTwo st2 = SingletonTwo.getInstance();
		System.out.println(st == st2);
	}

}

package com.imooc.animal;

public class Dog extends Animal {
	
	public Dog() {}
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("小狗" + this.getName() + "在做游戏！");
	}
	
}

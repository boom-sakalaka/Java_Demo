package com.imooc.animal;

public class Cat extends Animal {
	
	public Cat () {}
	
	public Cat (String name) {
		super(name);
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Сè" + this.getName() + "������Ϸ��");
	}

}

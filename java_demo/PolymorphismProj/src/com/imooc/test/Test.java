package com.imooc.test;

import com.imooc.shape.*;

public class Test {
	public static void main(String [] args) {
//		//���ɸ����������,���鳤��Ϊ5
//		Animal [] animal = new Animal[5];
//		//���������������������־��������ʵ��
//		for (int i = 0; i< animal.length; i++) {
//			int n = (int)(Math.random() * 3);
//			switch(n) {
//				case 0: animal[i] = new Cat();break;
//				case 1: animal[i] = new Dog();break;
//				case 2: animal[i] = new Sheep();break;
//			}
//		}
//		
//		//ѭ�������ѭ������ÿ������ֱ����cry()������
//		for(Animal anm: animal) {
//			anm.cry();
//		}
//		
		
		Circle cle = new Circle(3.5);
		cle.area();
		Rectangle regle = new Rectangle(5,6);
		regle.area();
		
	}
}

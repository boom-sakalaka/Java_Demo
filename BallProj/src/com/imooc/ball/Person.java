package com.imooc.ball;
// �ⲿ�� 
public class Person {
	public int age;
	public Heart getHeart() {
		return new Heart();
	}
	
	// ��Ա�ڲ���
	public class Heart {
		public String beat() {
			return Person.this.age + "�������������";
		}
	}
}

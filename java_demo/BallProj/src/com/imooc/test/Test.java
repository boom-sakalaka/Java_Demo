package com.imooc.test;

import com.imooc.ball.*;

public class Test {
	public static void main(String [] arg) {
//		Person lili = new Person();
//		lili.age = 12;
//		// ��ȡ�ڲ������ʵ�� ��ʽ
//		
//		// ��һ�ַ�ʽ new �ⲿ��.new �ڲ���
//		Person.Heart myHeart = new Person().new Heart();
//		System.out.println(myHeart.beat());
//		
//		// �ڶ��ַ�ʽ ʵ��
//		System.out.println(lili.new Heart().beat());
//		
//		// �����ַ�ʽ
//		System.out.println(lili.getHeart().beat());
		
		BallTest.Inner_m btm = new BallTest().new Inner_m();
		btm.play();
		BallTest bt = new BallTest();
		bt.info();
		bt.playBall(new Ball() {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("*********");
				System.out.println("�����ڲ���:");
				System.out.println("������");
			}
			
		});
		
	}
}

package com.imooc.ball;

public class BallTest {
	// ������Ա�ڲ���Inner_m
	public class Inner_m  implements Ball{

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("��Ա�ڲ���:");
			System.out.println("������");
		}
		
	}

	// ���������ڲ���
	public void info() {
		class lnner_f implements Ball {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("*********");
				System.out.println("�����ڲ���:");
				System.out.println("��ƹ����");
			}
			
		}
		new lnner_f().play();
	}
	
	// ����һ������void playBall(Ball ball)������play()����
	public void playBall(Ball ball) {
		ball.play();
	}
}

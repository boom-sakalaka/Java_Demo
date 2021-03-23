package com.imooc.thread1;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i =0; i<= 30; i++) {
			System.out.println(getName() + "��������" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main (String [] args) {
		MyThread mt1 = new MyThread("�߳�1");
		MyThread mt2 = new MyThread("�߳�2");
		mt1.start();
		mt2.start();
	}
}

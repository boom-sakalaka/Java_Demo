package com.imooc.thread1;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i =0; i<= 10; i++) {
			System.out.println(getName() + "��������" + i);
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

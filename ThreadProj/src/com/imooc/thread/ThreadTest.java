package com.imooc.thread;

class MyThread extends Thread {
	public void run () {
		System.out.println(getName() + "���߳�����ִ��!");
	}
}

public class ThreadTest {
	public static void main(String [] args) {
		System.out.println("���߳�1");
		MyThread mt = new MyThread();
		mt.start();// �����߳�
		System.out.println("���߳�2");
	}
}

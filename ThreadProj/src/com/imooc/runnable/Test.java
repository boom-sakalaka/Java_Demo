package com.imooc.runnable;

class PrintRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i <= 10) {
			System.out.println(Thread.currentThread().getName() + "正在运行" + i);
			i++;
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRunnable pr = new PrintRunnable();
		Thread t1 = new Thread(pr);
		t1.start();
		Thread t2 = new Thread(pr);
		t2.start();
	}

}

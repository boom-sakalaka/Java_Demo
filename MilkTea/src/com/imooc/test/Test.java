package com.imooc.test;

import com.imooc.MilkTea.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkTea [] mt = new MilkTea[10];
		
		for(int i = 0; i<mt.length; i++) {
			int randNum = (int) (Math.random() * 101);
			if(randNum >= 100) {
				mt[i] = new WuLongMacchiato();
			}else if(randNum >= 80) {
				mt[i] = new BubbleTea();
			}else if(randNum >= 60) {
				mt[i] = new PearlMilkTea();
			}else {
				mt[i] = new NoMilkTea();
			}
		}
		
		for(MilkTea mk : mt) {
			mk.info();
		}
	}

}

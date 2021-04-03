package com.imooc.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.imooc.house.House;

public class HouseTest {
	
	public void showHouseMenu() {
		System.out.println("***************************************");
		System.out.println("   房源中心 ");
		System.out.println("1--添加房源");
		System.out.println("2--查看具体房源信息");
		System.out.println("3--区间查看房源信息");
		System.out.println("0--推出房源中心");
		System.out.println("***************************************");
	}
	
	public static void main(String [] args) {
		HouseTest ht = new HouseTest();
		Scanner sc = new Scanner(System.in);
		List<House> arrList = new ArrayList<House> ();
		// 键盘输入值
		int input = 0;
		boolean isContinueShow = true;
		while(isContinueShow) {
			ht.showHouseMenu();
			System.out.println("请输入对应数字进行操作:");
			try {
				input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误,不能有非数字!");
				sc.next();
				continue;
			}
			Iterator<House> it;
			switch(input) {
				case 1: 
					try {
						System.out.println("添加房源");
						System.out.println("输入房源编号:");
						System.out.println("编号从0开始，并为连续数值，如：0，1，2，3，4");
						int houseId = sc.nextInt();
						System.out.println("请输入房源名称:");
						String houseName = sc.next();
						System.out.println("请输入房源地址:");
						String houseAddress = sc.next();
						System.out.println("请输入房源户型:");
						String houseType = sc.next();
						House hs = new House(houseId,houseName,houseAddress,houseType);
						arrList.add(hs);
					}catch(InputMismatchException e) {
						System.out.println("输入的数据格式有误,请重新输入");
						sc.next();
						continue;
					}
					break;
				case 2:
					it = arrList.iterator();
					while(it.hasNext()) {
						System.out.println(it.next().toStringTwo());
					}
					break;
				case 3: 
					it = arrList.iterator();
					System.out.println("全部房源信息 ");
					while(it.hasNext()) {
						System.out.println(it.next().toStringTwo());
					}
					try {
						System.out.println("请输入要查看房源信息的第一个编号");
						int startInd = sc.nextInt();
						System.out.println("请输入要查看房源信息的第二个编号");
						int endInd = sc.nextInt();
						int arrSzie = arrList.size();
						if(arrSzie > startInd && endInd < arrSzie) {
							for(int i = startInd; i< endInd; i++) {
								System.out.println(arrList.get(i));
							}
						}else {
							throw new InputMismatchException();
						}
					}catch(InputMismatchException e) {
						System.out.println("输入的数据格式有误,请重新输入");
						continue;
					}
					break;
				case 0:
					System.out.println("结束程序");
					isContinueShow = false;
					break;
			}
			
		}
		
		
	}
}

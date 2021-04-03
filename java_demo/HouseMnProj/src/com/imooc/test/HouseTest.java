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
		System.out.println("   ��Դ���� ");
		System.out.println("1--��ӷ�Դ");
		System.out.println("2--�鿴���巿Դ��Ϣ");
		System.out.println("3--����鿴��Դ��Ϣ");
		System.out.println("0--�Ƴ���Դ����");
		System.out.println("***************************************");
	}
	
	public static void main(String [] args) {
		HouseTest ht = new HouseTest();
		Scanner sc = new Scanner(System.in);
		List<House> arrList = new ArrayList<House> ();
		// ��������ֵ
		int input = 0;
		boolean isContinueShow = true;
		while(isContinueShow) {
			ht.showHouseMenu();
			System.out.println("�������Ӧ���ֽ��в���:");
			try {
				input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("��������ݸ�ʽ����,�����з�����!");
				sc.next();
				continue;
			}
			Iterator<House> it;
			switch(input) {
				case 1: 
					try {
						System.out.println("��ӷ�Դ");
						System.out.println("���뷿Դ���:");
						System.out.println("��Ŵ�0��ʼ����Ϊ������ֵ���磺0��1��2��3��4");
						int houseId = sc.nextInt();
						System.out.println("�����뷿Դ����:");
						String houseName = sc.next();
						System.out.println("�����뷿Դ��ַ:");
						String houseAddress = sc.next();
						System.out.println("�����뷿Դ����:");
						String houseType = sc.next();
						House hs = new House(houseId,houseName,houseAddress,houseType);
						arrList.add(hs);
					}catch(InputMismatchException e) {
						System.out.println("��������ݸ�ʽ����,����������");
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
					System.out.println("ȫ����Դ��Ϣ ");
					while(it.hasNext()) {
						System.out.println(it.next().toStringTwo());
					}
					try {
						System.out.println("������Ҫ�鿴��Դ��Ϣ�ĵ�һ�����");
						int startInd = sc.nextInt();
						System.out.println("������Ҫ�鿴��Դ��Ϣ�ĵڶ������");
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
						System.out.println("��������ݸ�ʽ����,����������");
						continue;
					}
					break;
				case 0:
					System.out.println("��������");
					isContinueShow = false;
					break;
			}
			
		}
		
		
	}
}

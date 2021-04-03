package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.imooc.CircusTroup.*;

public class CircusTroupTest {
	/**
	 *  ��ʾ������
	 */
	public void showSelectMenu() {
		System.out.println("***********��ӭ����̫����Ϸ��*********");
		System.out.println("*********** ��ѡ������� ***************");
		System.out.println("*********** 1������ **********************");
		System.out.println("*********** 2��ʨ�� **********************");
		System.out.println("*********** 3������ **********************");
		System.out.println("*********** 4������ **********************");
		System.out.println("*********** 5��С�� **********************");
	}
	
	/**
	 * ���ñ��ݷ���
	 * @param actNow
	 */
	public void toAct(IAct actNow) {
		System.out.println(actNow.act());
	}
	
	public static void main(String[] args) {	
		// ʵ�������Է���
		CircusTroupTest ctTest = new CircusTroupTest();
		Scanner sn = new Scanner(System.in);
		
		//��������ֵ��ʼ��
		int input = 0;
		boolean isContinueShow = true;
		while(isContinueShow) {
			// ������ʾ�����߲˵�
			ctTest.showSelectMenu();
			try {
				input = sn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("��������ݸ�ʽ����,�����з�����!");
				sn.next();
				continue;
			}
			switch(input) {
				case 1 : 
					ctTest.toAct(new Bear("Bill",1));
					break;
				case 2 :
					ctTest.toAct(new Lion("Lain",2,"��ɫ","��"));
					break;
				case 3 :
					ctTest.toAct(new Monkey("Tom",1,"��˿��"));
					break;
				case 4 : 
					ctTest.toAct(new Parrot("Rose",1,"ĵ������"));
					break;
				case 5 : 
					ctTest.toAct(new Clown("Kahle", 5));
					break;
				default: 
					System.out.println("������0-5֮�������");
					continue;
			}
			
			while(true) {
				System.out.println("***** �Ƿ�����ۿ�(1/0) *****");
				try {
					input = sn.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("��������ݸ�ʽ����,�����з�����!");
					sn.next();
					continue;
				}
				if(input == 1) {
					break;
				}else if (input == 0){
					System.out.println("***** ��ӭ�´ι��� *****");
					isContinueShow = false;
					break;
				}else {
					System.out.println("***** ������Ϣ��׼ȷ������������ *****");
					continue;
				}
			}
			
		}
	}
}

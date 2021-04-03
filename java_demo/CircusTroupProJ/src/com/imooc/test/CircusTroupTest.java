package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.imooc.CircusTroup.*;

public class CircusTroupTest {
	/**
	 *  显示表演者
	 */
	public void showSelectMenu() {
		System.out.println("***********欢迎来到太阳马戏团*********");
		System.out.println("*********** 请选择表演者 ***************");
		System.out.println("*********** 1、棕熊 **********************");
		System.out.println("*********** 2、狮子 **********************");
		System.out.println("*********** 3、猴子 **********************");
		System.out.println("*********** 4、鹦鹉 **********************");
		System.out.println("*********** 5、小丑 **********************");
	}
	
	/**
	 * 调用表演方法
	 * @param actNow
	 */
	public void toAct(IAct actNow) {
		System.out.println(actNow.act());
	}
	
	public static void main(String[] args) {	
		// 实例化测试方法
		CircusTroupTest ctTest = new CircusTroupTest();
		Scanner sn = new Scanner(System.in);
		
		//键盘输入值初始化
		int input = 0;
		boolean isContinueShow = true;
		while(isContinueShow) {
			// 调用显示表演者菜单
			ctTest.showSelectMenu();
			try {
				input = sn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误,不能有非数字!");
				sn.next();
				continue;
			}
			switch(input) {
				case 1 : 
					ctTest.toAct(new Bear("Bill",1));
					break;
				case 2 :
					ctTest.toAct(new Lion("Lain",2,"灰色","公"));
					break;
				case 3 :
					ctTest.toAct(new Monkey("Tom",1,"金丝猴"));
					break;
				case 4 : 
					ctTest.toAct(new Parrot("Rose",1,"牡丹鹦鹉"));
					break;
				case 5 : 
					ctTest.toAct(new Clown("Kahle", 5));
					break;
				default: 
					System.out.println("请输入0-5之间的数字");
					continue;
			}
			
			while(true) {
				System.out.println("***** 是否继续观看(1/0) *****");
				try {
					input = sn.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("输入的数据格式有误,不能有非数字!");
					sn.next();
					continue;
				}
				if(input == 1) {
					break;
				}else if (input == 0){
					System.out.println("***** 欢迎下次光临 *****");
					isContinueShow = false;
					break;
				}else {
					System.out.println("***** 输入信息不准确，请重新输入 *****");
					continue;
				}
			}
			
		}
	}
}

package com.imooc;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 从键盘中接收成绩，放到数组中进行管理
 * @author GZH
 *
 */
public class ScoreManage {
	
	/**
	 * 显示功能
	 */
	public void notice() {
		System.out.println("***********************************");
		System.out.println("         1.--初始化数学成绩");
		System.out.println("         2.--求成绩的平均值");
		System.out.println("         3.--统计成绩大于85分的人数");
		System.out.println("         4.--修改指定位置处的成绩");
		System.out.println("         5.--打印输出所有成绩");
		System.out.println("         0.退出");
		System.out.println("***********************************");
	}
	
	public static void main(String[] args) {
		// 实例化对象
		ScoreManage sm = new ScoreManage();
		
		// 调用 显示功能
		sm.notice();
		Scanner sn = new Scanner(System.in);
		
		//键盘输入值初始化
		int input = 0;
		
		//初始化分数数组
		float[] a = null;
		
		
		//循环调用
		while(true) {
			// 对输入的值做校验
			try {
				input = sn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误,不能有非数字!");
				sn.next();
				continue;
			}
			
			if(input == 0) {
				System.out.println("程序结束");
				break;
			}
			
			switch(input) {
			case 1: System.out.println("初始化数学成绩");break;
			case 2: System.out.println("求成绩的平均值");break;
			case 3: System.out.println("统计成绩大于85分的人数");break;
			case 4: System.out.println("修改指定位置处的成绩");break;
			case 5: System.out.println("打印输出所有成绩");break;
			default:System.out.println("请输入0-5之间的数字"); break;
				
			}
		}
		
		
	}

}

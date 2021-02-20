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
	
	/**
	 * 插入数据
	 * len 数组长度 要存储成绩的个数
	 * @return 存储数据的数组
	 */
	public float [] insertScoreData (int len) {
		float [] a = new float[len];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+ (i+1) + "个数");
			try {
				a[i] = sc.nextFloat();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字!");
				sc.next();
				i--;
			}
			
		}
		
		return a;
	}
	
	/**
	 * 显示分数
	 * @param a 分数数组
	 */
	public void showScoreData (float [] a) {
		System.out.println("成绩为:");
		for(int i = 0; i< a.length; i++) {
			System.out.print(+a[i] + "   ");
		}
		System.out.println();
	}
	
	/**
	 * 求分数的平均值
	 * @param a 分数数组
	 * @return 平均分
	 */
	public float getAverage(float [] a) {
		float sum = 0;
		for(float num : a) {
			sum+= num;
		}
		return sum/a.length;
	}
	
	/**
	 * 统计成绩大于85分的人数
	 * @param a 分数数组
	 * @return 成绩大于85分的人数
	 */
	public int getStuNum(float [] a) {
		int num = 0;
		for(float score : a) {
			if(score > 85) {
				num++;
			}
		}
		return num;
	}
	
	/**
	 * 修改成绩
	 * @param a 成绩数组
	 * @param index 修改下标
	 * @param changeSocre 要修改的成绩
	 */
	public void changeScoreFn (float [] a,int index,float changeSocre) {
		try {
			a[index] = changeSocre;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		}
	}
	
	public static void main(String[] args) {
		// 实例化对象
		ScoreManage sm = new ScoreManage();
		Scanner sn = new Scanner(System.in);
		//键盘输入值初始化
		int input = 0;
		//初始化分数数组
		float[] a = null;
		int n = 0,ind = 0;
		float changeSocre = 0;
		//循环调用
		while(true) {
			// 调用 显示功能
			sm.notice();
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
			case 1: 
				//初始化
				System.out.println("请输入要存储的数学成绩的数量:");
				try {
					n = sn.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("输入的数据格式有误，不得有非数字!");
					sn.next();
					break;
				}
				a= sm.insertScoreData(n);
				sm.showScoreData(a);
				break;
			case 2: 
				// 求平均值
				if(a != null) {
					float averageNum = sm.getAverage(a);
					System.out.println("数学平均成绩为:"+averageNum);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作!");
				}
				break;
			case 3:
				// 统计成绩大于85分的人数
				if(a != null) {
					System.out.println("成绩大于85分的人数为:"+sm.getStuNum(a));
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作!");
				}
				
				break;
			case 4:
				// 修改指定位置处的成绩
				if(a != null) {
					System.out.println("修改前:");
					sm.showScoreData(a);
					try {
						System.out.println("请输入要修改数据的位置(从0开始)");
						ind = sn.nextInt();
						System.out.println("请输入新数据");
						changeSocre = sn.nextFloat();
					}catch(InputMismatchException e) {
						System.out.println("输入的数据格式有误，不得有非数字!");
						sn.next();
						break;
					}
					sm.changeScoreFn(a, ind, changeSocre);
					System.out.println("修改后:");
					sm.showScoreData(a);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作!");
				}
				break;
			case 5: 
				//打印输出所有成绩
				if(a != null) {
					sm.showScoreData(a);
				}else {
					System.out.println("还未在数组中插入数据，请重新选择操作!");
				}
				break;
			default:System.out.println("请输入0-5之间的数字"); break;
				
			}
		}
		
		
	}

}

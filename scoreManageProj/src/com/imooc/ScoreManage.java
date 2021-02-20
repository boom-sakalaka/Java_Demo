package com.imooc;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * �Ӽ����н��ճɼ����ŵ������н��й���
 * @author GZH
 *
 */
public class ScoreManage {
	
	/**
	 * ��ʾ����
	 */
	public void notice() {
		System.out.println("***********************************");
		System.out.println("         1.--��ʼ����ѧ�ɼ�");
		System.out.println("         2.--��ɼ���ƽ��ֵ");
		System.out.println("         3.--ͳ�Ƴɼ�����85�ֵ�����");
		System.out.println("         4.--�޸�ָ��λ�ô��ĳɼ�");
		System.out.println("         5.--��ӡ������гɼ�");
		System.out.println("         0.�˳�");
		System.out.println("***********************************");
	}
	
	/**
	 * ��������
	 * len ���鳤�� Ҫ�洢�ɼ��ĸ���
	 * @return �洢���ݵ�����
	 */
	public float [] insertScoreData (int len) {
		float [] a = new float[len];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++) {
			System.out.println("�������"+ (i+1) + "����");
			try {
				a[i] = sc.nextFloat();
			}catch(InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣬲����з�����!");
				sc.next();
				i--;
			}
			
		}
		
		return a;
	}
	
	/**
	 * ��ʾ����
	 * @param a ��������
	 */
	public void showScoreData (float [] a) {
		System.out.println("�ɼ�Ϊ:");
		for(int i = 0; i< a.length; i++) {
			System.out.print(+a[i] + "   ");
		}
		System.out.println();
	}
	
	/**
	 * �������ƽ��ֵ
	 * @param a ��������
	 * @return ƽ����
	 */
	public float getAverage(float [] a) {
		float sum = 0;
		for(float num : a) {
			sum+= num;
		}
		return sum/a.length;
	}
	
	/**
	 * ͳ�Ƴɼ�����85�ֵ�����
	 * @param a ��������
	 * @return �ɼ�����85�ֵ�����
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
	 * �޸ĳɼ�
	 * @param a �ɼ�����
	 * @param index �޸��±�
	 * @param changeSocre Ҫ�޸ĵĳɼ�
	 */
	public void changeScoreFn (float [] a,int index,float changeSocre) {
		try {
			a[index] = changeSocre;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ��");
		}
	}
	
	public static void main(String[] args) {
		// ʵ��������
		ScoreManage sm = new ScoreManage();
		Scanner sn = new Scanner(System.in);
		//��������ֵ��ʼ��
		int input = 0;
		//��ʼ����������
		float[] a = null;
		int n = 0,ind = 0;
		float changeSocre = 0;
		//ѭ������
		while(true) {
			// ���� ��ʾ����
			sm.notice();
			// �������ֵ��У��
			try {
				input = sn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("��������ݸ�ʽ����,�����з�����!");
				sn.next();
				continue;
			}
			
			if(input == 0) {
				System.out.println("�������");
				break;
			}
			
			switch(input) {
			case 1: 
				//��ʼ��
				System.out.println("������Ҫ�洢����ѧ�ɼ�������:");
				try {
					n = sn.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("��������ݸ�ʽ���󣬲����з�����!");
					sn.next();
					break;
				}
				a= sm.insertScoreData(n);
				sm.showScoreData(a);
				break;
			case 2: 
				// ��ƽ��ֵ
				if(a != null) {
					float averageNum = sm.getAverage(a);
					System.out.println("��ѧƽ���ɼ�Ϊ:"+averageNum);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			case 3:
				// ͳ�Ƴɼ�����85�ֵ�����
				if(a != null) {
					System.out.println("�ɼ�����85�ֵ�����Ϊ:"+sm.getStuNum(a));
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				
				break;
			case 4:
				// �޸�ָ��λ�ô��ĳɼ�
				if(a != null) {
					System.out.println("�޸�ǰ:");
					sm.showScoreData(a);
					try {
						System.out.println("������Ҫ�޸����ݵ�λ��(��0��ʼ)");
						ind = sn.nextInt();
						System.out.println("������������");
						changeSocre = sn.nextFloat();
					}catch(InputMismatchException e) {
						System.out.println("��������ݸ�ʽ���󣬲����з�����!");
						sn.next();
						break;
					}
					sm.changeScoreFn(a, ind, changeSocre);
					System.out.println("�޸ĺ�:");
					sm.showScoreData(a);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			case 5: 
				//��ӡ������гɼ�
				if(a != null) {
					sm.showScoreData(a);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			default:System.out.println("������0-5֮�������"); break;
				
			}
		}
		
		
	}

}

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
	public void displayMenu() {
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
	public float [] initScore (int len) {
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
	 * @param f ��������
	 */
	public void displayAllScore (float [] a) {
		System.out.println("�ɼ�Ϊ:");
		for(int i = 0; i< a.length; i++) {
			System.out.print(+a[i] + "   ");
		}
		System.out.println();
	}
	
	/**
	 * �������ƽ��ֵ
	 * @param f ��������
	 * @return ƽ����
	 */
	public float average(float [] f) {
		float sum = 0;
		for(float num : f) {
			sum+= num;
		}
		return sum/f.length;
	}
	
	/**
	 * ͳ�Ƴɼ�����85�ֵ�����
	 * @param f ��������
	 * @return �ɼ�����85�ֵ�����
	 */
	public int count(float [] f) {
		int num = 0;
		for(float score : f) {
			if(score > 85) {
				num++;
			}
		}
		return num;
	}
	
	/**
	 * �޸ĳɼ�
	 * @param f �ɼ�����
	 * @param index �޸��±�
	 * @param newScore Ҫ�޸ĵĳɼ�
	 */
	public void update (float [] f,int index,float newScore) {
		try {
			f[index] = newScore;
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
			sm.displayMenu();
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
				a= sm.initScore(n);
				sm.displayAllScore(a);
				break;
			case 2: 
				// ��ƽ��ֵ
				if(a != null) {
					float averageNum = sm.average(a);
					System.out.println("��ѧƽ���ɼ�Ϊ:"+averageNum);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			case 3:
				// ͳ�Ƴɼ�����85�ֵ�����
				if(a != null) {
					System.out.println("�ɼ�����85�ֵ�����Ϊ:"+sm.count(a));
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				
				break;
			case 4:
				// �޸�ָ��λ�ô��ĳɼ�
				if(a != null) {
					System.out.println("�޸�ǰ:");
					sm.displayAllScore(a);
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
					sm.update(a, ind, changeSocre);
					System.out.println("�޸ĺ�:");
					sm.displayAllScore(a);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			case 5: 
				//��ӡ������гɼ�
				if(a != null) {
					sm.displayAllScore(a);
				}else {
					System.out.println("��δ�������в������ݣ�������ѡ�����!");
				}
				break;
			default:System.out.println("������0-5֮�������"); break;
				
			}
		}
		
		
	}

}

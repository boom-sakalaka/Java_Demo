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
	
	public static void main(String[] args) {
		// ʵ��������
		ScoreManage sm = new ScoreManage();
		
		// ���� ��ʾ����
		sm.notice();
		Scanner sn = new Scanner(System.in);
		
		//��������ֵ��ʼ��
		int input = 0;
		
		//��ʼ����������
		float[] a = null;
		
		
		//ѭ������
		while(true) {
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
			case 1: System.out.println("��ʼ����ѧ�ɼ�");break;
			case 2: System.out.println("��ɼ���ƽ��ֵ");break;
			case 3: System.out.println("ͳ�Ƴɼ�����85�ֵ�����");break;
			case 4: System.out.println("�޸�ָ��λ�ô��ĳɼ�");break;
			case 5: System.out.println("��ӡ������гɼ�");break;
			default:System.out.println("������0-5֮�������"); break;
				
			}
		}
		
		
	}

}

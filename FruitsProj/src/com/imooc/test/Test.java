package com.imooc.test;

import com.imooc.model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fru1 = new Fruits("Բ��","�����");
		Fruits fru2 = new Fruits("Բ��","�����");
		fru1.eat();
		System.out.println("fru1��fru2�����ñȽ�" + fru1.equals(fru2));
		System.out.println("=======================================");
		
		Waxberry wb1 = new Waxberry("Բ��", "��������", "�Ϻ�ɫ");
		System.out.println(wb1.face());
		wb1.eat();
		System.out.println(wb1.toString());
		System.out.println("=======================================");
		Banana ba = new Banana("�̶���Բ", "����", "���˽�");
		ba.advantage();
		ba.advantage("��ɫ");
		
	}

}

package com.imooc.animal;

public class Dog extends Animal {
	private String sex; // �Ա�
	
	public Dog() {}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// ˯���ķ���
	public void sleep () {
		System.out.println(this.getName() + "����" + this.getMonth()
		+ "���´�����˯��~~~~~~");
	}
	
	/**
	 * ��������:
	 * 1.ͬһ������
	 * 2.��������ͬ,�����б�ͬ(����˳�� ������������)
	 * 3.��������ֵ���������η�����
	 * 4.�뷽���Ĳ��������޹�
	 * 
	 * 
	 * ������д:
	 * 1.�м̳й�ϵ��������
	 * 2.��������ͬ�������б���ͬ(����˳�� ������������)
	 * 3.�뷽���Ĳ��������޹�
	 * 4.��������ֵ :����������ֵ��void���߻�����������ʱ��������ͬ��������ֵ����������ʱ��
	 * �������丸���������
	 */
	
//	public void sleep(String str) {
//		
//	}
//	
//	public String sleep(int str) {
//		return "";
//	}
	
	public void eat() {
		System.out.println( this.getName() +"���û��ʳ��");
	}
	
	public void eat(String name) {
		System.out.println( name +"���û��ʳ��");
	}
	
	public String eat(int age) {
		return "";
	}
	
}

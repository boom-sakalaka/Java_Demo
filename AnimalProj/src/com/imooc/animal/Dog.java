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
	
}

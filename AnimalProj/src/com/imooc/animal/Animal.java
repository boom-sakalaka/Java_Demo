package com.imooc.animal;

public class Animal {
	private String name; // �ǳ�
	private int month; // �·�
	private String species; // Ʒ��
	
	public Animal() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	// �Զ���
	public void eat() {
		System.out.println(this.getName() + "�ڳԶ���");
	}
	
}

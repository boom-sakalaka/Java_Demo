package com.imooc.animal;
/**
 * ����è��
 * @author GZH
 *
 */
public class Cat {
	// ��Ա���� �� �ǳ� ���� ���� Ʒ��
	String name;
	int month;
	double weight;
	String species;
	
	public Cat (String name,int month,double weight,String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}
	
	// ������ �ܶ����Զ���
	public void run () {
		System.out.println( this.name +"Сè����");
	}
	
	public void eat () {
		System.out.println("Сè����");
	}
	
	
}

package com.imooc.CircusTroup;

public class Clown  implements IAct  {
	// ��Ա���� ���� ����
	private String name;
	private int years;
	
	// �޲ι��췽��
	public Clown () {}
	
	// �вι��췽��
	public Clown (String name, int years) {
		this.setName(name);
		this.setYears(years);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		// ��һ��У��
		if(years <= 0) {
			years = 1;
		}
		this.years = years;
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "�Ųȸ��Σ������Ӽ�ħ������";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getYears() + "��"
		+ "\n��װ��" + this.dress()
		+ "\n���ܣ�" + this.skill(); 
	}
	
	public String dress() {
		return "����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ";
	}
	
	

}

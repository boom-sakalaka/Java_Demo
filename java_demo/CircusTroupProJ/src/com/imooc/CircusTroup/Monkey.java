package com.imooc.CircusTroup;

public class Monkey extends Animal implements IAct {
	// ��Ա���� Ʒ��
	private String type;
	
	// �޲ι��췽��
	public Monkey() {
		
	}
	
	// �вι��췽��
	public Monkey(String name,int age, String type) {
		super(name,age);
		this.setType(type);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "����ֳ�����ľ��";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getAge() + "��"
		+ "\nƷ�֣�" + this.getType()
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "ϲ��ģ���˵Ķ�������";
	}
	
}

package com.imooc.CircusTroup;

public class Bear extends Animal implements IAct  {
	// �޲ι��췽��
	public Bear() {}
	
	// �вι��췽��
	public Bear (String name, int age) {
		super(name,age);
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���Ż�����������ɡ����������";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName() 
		+ "\n���䣺" + this.getAge() + "��"
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "ϲ������";
	}
	

}

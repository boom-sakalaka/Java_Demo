package com.imooc.CircusTroup;

public class Lion extends Animal implements IAct {
	// ��Ա���� ��ɫ �Ա�
	private String color;
	private String sex;

	// �޲ι��췽��
	public Lion () {}
	
	// �вι��췽��
	public Lion(String name, int age, String color,String sex) {
		super(name,age);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		// ���Ա���У��
		if(sex.equals("��ʨ") || sex.equals("ĸʨ")) {
			this.sex = sex;
		}
		this.sex = "��ʨ";
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "�ó����Ȧ";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getAge() + "��" 
		+"\n�Ա�" + this.getSex()
		+ "\nëɫ��" + this.getColor()
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "ϲ���Ը�������";
	}

}

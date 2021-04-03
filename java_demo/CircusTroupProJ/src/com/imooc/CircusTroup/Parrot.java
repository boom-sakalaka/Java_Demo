package com.imooc.CircusTroup;

public class Parrot extends Animal implements IAct{
	// 成员属性 品种
	private String type;
	
	// 无参构造函数
	public Parrot () {}
	
	// 有参构造函数
	public Parrot (String name, int age, String type) {
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
		return "擅长模仿";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName()
		+ "\n年龄：" + this.getAge() + "岁"
		+ "\n品种：" + this.getType()
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢吃坚果和松子";
	}
	
}

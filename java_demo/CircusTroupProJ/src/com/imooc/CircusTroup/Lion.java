package com.imooc.CircusTroup;

public class Lion extends Animal implements IAct {
	// 成员属性 颜色 性别
	private String color;
	private String sex;

	// 无参构造方法
	public Lion () {}
	
	// 有参构造方法
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
		// 对性别做校验
		if(sex.equals("公狮") || sex.equals("母狮")) {
			this.sex = sex;
		}
		this.sex = "公狮";
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "擅长钻火圈";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName()
		+ "\n年龄：" + this.getAge() + "岁" 
		+"\n性别：" + this.getSex()
		+ "\n毛色：" + this.getColor()
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢吃各种肉类";
	}

}

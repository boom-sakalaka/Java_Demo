package com.imooc.CircusTroup;

public class Bear extends Animal implements IAct  {
	// 无参构造方法
	public Bear() {}
	
	// 有参构造方法
	public Bear (String name, int age) {
		super(name,age);
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "挽着花篮，打着雨伞，自立走秀";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName() 
		+ "\n年龄：" + this.getAge() + "岁"
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢卖萌";
	}
	

}

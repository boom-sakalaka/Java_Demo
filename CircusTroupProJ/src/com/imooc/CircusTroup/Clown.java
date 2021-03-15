package com.imooc.CircusTroup;

public class Clown  implements IAct  {
	// 成员属性 名字 艺龄
	private String name;
	private int years;
	
	// 无参构造方法
	public Clown () {}
	
	// 有参构造方法
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
		// 做一下校验
		if(years <= 0) {
			years = 1;
		}
		this.years = years;
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "脚踩高跷，进行杂技魔术表演";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName()
		+ "\n艺龄：" + this.getYears() + "年"
		+ "\n着装：" + this.dress()
		+ "\n技能：" + this.skill(); 
	}
	
	public String dress() {
		return "身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
	}
	
	

}

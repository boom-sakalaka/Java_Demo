package com.imooc.model;

public class Title {
	// 成员属性: 职务编号 职务名字
	private String titleNo;
	private String titleName;
	
	// 无参构造方法
	public Title () {}
	
	// 有参构造方法
	public Title (String titleNo,String titleName) {
		this.setTitleName(titleName);
		this.setTitleNo(titleNo);
	}
	
	public String getTitleNo() {
		return titleNo;
	}
	public void setTitleNo(String titleNo) {
		this.titleNo = titleNo;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	
}

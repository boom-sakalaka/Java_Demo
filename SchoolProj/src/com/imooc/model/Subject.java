package com.imooc.model;

public class Subject {
	// 成员属性: 学科名称、学科编号、学制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	
	// 无参构造方法
	public Subject() {
		
	}
	
	// 带参构造 实现对属性的全部赋值
	public Subject(String subjectName,String subjectNo,int subjectLife) {
		this.setSubjectLife(subjectLife);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
	}
	
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return this.subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	public void setSubjectLife(int subjectLife) {
		if(subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息 包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下:\n专业名称:" 
				+ this.getSubjectName() + "\n专业编号" 
				+ this.getSubjectNo() + "\n学制年限" 
				+ this.getSubjectLife() + "年";
		return str;
	}
}

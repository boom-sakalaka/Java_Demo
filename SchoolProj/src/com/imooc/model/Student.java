package com.imooc.model;

public class Student {
	// 成员属性: 学号、姓名、性别、年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	
	// 无参构造方法
	public Student() {
		
	}
	
	// 多参构造方法 实现对全部属性的赋值
	public Student(String studentNo,String studentName,String studentSex,int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
	}
	
	
	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSex() {
		return this.getStudentSex();
	}
	public void setStudentSex(String studentSex) {
		if(studentSex == "男" || studentSex == "女") {
			this.studentSex = studentSex;
		}else {
			this.studentSex = "男";
		}
	}
	
	public int getStudentAge() {
		return this.studentAge;
	}
	public void setStudentAge(int studentAge) {
		if(studentAge < 10 || studentAge > 100) {
			this.studentAge = 18;
		}else {
			this.studentAge = studentAge;
		}
	} 
	
	/**
	 *  
	 * @return 信息介绍
	 */
	public String info() {
		return "学生信息如下:\n学号:" + this.getStudentNo() 
		+ "\n姓名:" + this.getStudentName() 
		+ "\n性别:" + this.getStudentAge()
		+ "\n年龄:" + this.getStudentAge();
	}
}

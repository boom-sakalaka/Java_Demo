package com.imooc.model;

public class Student {
	// 成员属性: 学号、姓名、性别、年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	
	// 无参构造方法
	public Student() {
		
	}
	
	// 多参构造方法 实现对全部属性的赋值
	public Student(String studentNo,String studentName,String studentSex,int studentAge,Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
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
		return this.studentSex;
	}
	public void setStudentSex(String studentSex) {
		if(studentSex.equals('男') || studentSex.equals('女')) {
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
	
	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}
	
	public Subject getStudentSubject() {
		if(this.studentSubject == null)
			this.studentSubject = new Subject();
		return this.studentSubject;
	}
	
	/**
	 *  
	 * @return 信息介绍
	 */
	public String info() {
		return "学生信息如下:\n学号:" + this.getStudentNo() 
		+ "\n姓名:" + this.getStudentName() 
		+ "\n性别:" + this.getStudentSex()
		+ "\n年龄:" + this.getStudentAge()
		+ "\n专业编号:"+ this.getStudentSubject().getSubjectNo()
		+ "\n专业:" + this.getStudentSubject().getSubjectName()
		+ "\n学制年限:" + this.getStudentSubject().getSubjectLife();
	}
	
	/**
	 * 学生自我介绍的方法
	 * @param subjectName
	 * @param subjectLife
	 * @return 学生介绍 包含 学生的专业和专业年限
	 */
	public String info(String subjectName , String subjectLife) {
		return "学生信息如下:\n学号:" + this.getStudentNo() 
		+ "\n姓名:" + this.getStudentName() 
		+ "\n性别:" + this.getStudentSex()
		+ "\n年龄:" + this.getStudentAge()
		+ "\n专业:" + subjectName
		+ "\n学制年限:" + subjectLife;
	}
	
	public String info(Subject mySubject) {
		return "学生信息如下:\n学号:" + this.getStudentNo() 
		+ "\n姓名:" + this.getStudentName() 
		+ "\n性别:" + this.getStudentSex()
		+ "\n年龄:" + this.getStudentAge()
		+ "\n专业编号:"+ mySubject.getSubjectNo()
		+ "\n专业:" + mySubject.getSubjectName()
		+ "\n学制年限:" + mySubject.getSubjectLife();
	}
}

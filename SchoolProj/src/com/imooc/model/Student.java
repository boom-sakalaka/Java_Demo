package com.imooc.model;

public class Student {
	// ��Ա����: ѧ�š��������Ա�����
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	
	// �޲ι��췽��
	public Student() {
		
	}
	
	// ��ι��췽�� ʵ�ֶ�ȫ�����Եĸ�ֵ
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
		if(studentSex == "��" || studentSex == "Ů") {
			this.studentSex = studentSex;
		}else {
			this.studentSex = "��";
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
	 * @return ��Ϣ����
	 */
	public String info() {
		return "ѧ����Ϣ����:\nѧ��:" + this.getStudentNo() 
		+ "\n����:" + this.getStudentName() 
		+ "\n�Ա�:" + this.getStudentAge()
		+ "\n����:" + this.getStudentAge();
	}
}

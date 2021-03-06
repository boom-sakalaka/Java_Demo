package com.imooc.model;

public class Student {
	// ��Ա����: ѧ�š��������Ա�����
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	
	// �޲ι��췽��
	public Student() {
		
	}
	
	// ��ι��췽�� ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Student(String studentNo,String studentName,String studentSex,int studentAge,Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
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
		return this.studentSex;
	}
	public void setStudentSex(String studentSex) {
		if(studentSex.equals('��') || studentSex.equals('Ů')) {
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
	 * @return ��Ϣ����
	 */
	public String info() {
		return "ѧ����Ϣ����:\nѧ��:" + this.getStudentNo() 
		+ "\n����:" + this.getStudentName() 
		+ "\n�Ա�:" + this.getStudentSex()
		+ "\n����:" + this.getStudentAge()
		+ "\nרҵ���:"+ this.getStudentSubject().getSubjectNo()
		+ "\nרҵ:" + this.getStudentSubject().getSubjectName()
		+ "\nѧ������:" + this.getStudentSubject().getSubjectLife();
	}
	
	/**
	 * ѧ�����ҽ��ܵķ���
	 * @param subjectName
	 * @param subjectLife
	 * @return ѧ������ ���� ѧ����רҵ��רҵ����
	 */
	public String info(String subjectName , String subjectLife) {
		return "ѧ����Ϣ����:\nѧ��:" + this.getStudentNo() 
		+ "\n����:" + this.getStudentName() 
		+ "\n�Ա�:" + this.getStudentSex()
		+ "\n����:" + this.getStudentAge()
		+ "\nרҵ:" + subjectName
		+ "\nѧ������:" + subjectLife;
	}
	
	public String info(Subject mySubject) {
		return "ѧ����Ϣ����:\nѧ��:" + this.getStudentNo() 
		+ "\n����:" + this.getStudentName() 
		+ "\n�Ա�:" + this.getStudentSex()
		+ "\n����:" + this.getStudentAge()
		+ "\nרҵ���:"+ mySubject.getSubjectNo()
		+ "\nרҵ:" + mySubject.getSubjectName()
		+ "\nѧ������:" + mySubject.getSubjectLife();
	}
}

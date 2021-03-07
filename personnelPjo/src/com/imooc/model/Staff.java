package com.imooc.model;

public class Staff {
	// ��Ա���� : Ա�����š�Ա��������  Ա���Ա� Ա�����䡢 ���ڲ��š�ְ��
	private String staffNo;
	private String staffName;
	private String staffSex;
	private int staffAge;
	private Department staffDepartment;
	private Title staffTitle;
	
	//�޲ι��캯��
	public Staff() {}
	
	// �вι��캯��
	public Staff(String staffNo,String staffName,String staffSex,int staffAge,Department staffDepartment,Title staffTitle) {
		this.setStaffNo(staffNo);
		this.setStaffName(staffName);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
		this.setStaffDepartment(staffDepartment);
		this.setStaffTitle(staffTitle);
	}
	
	
	// Ա�����
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	
	
	
	// Ա������
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	
	
	//Ա���Ա�
	public String getStaffSex() {
		return staffSex;
	}
	public void setStaffSex(String staffSex) {
		if(staffSex.equals("��") || staffSex.equals("Ů")) {
			this.staffSex = staffSex;
		}else {
			this.staffSex = "��";
		}
	}
	
	
	
	//Ա������
	public int getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(int staffAge) {
		if(staffAge >=18 && staffAge <=65) {
			this.staffAge = staffAge;
		}else {
			this.staffAge = 18;
		}
		
	}
	
	
	
	// ���ڲ���
	public Department getStaffDepartment() {
		if(this.staffDepartment == null) {
			this.staffDepartment = new Department();
		}
		return staffDepartment;
	}
	public void setStaffDepartment(Department staffDepartment) {
		this.staffDepartment = staffDepartment;
	}
	
	
	
	//ְ��
	public Title getStaffTitle() {
		if(this.staffTitle == null) {
			this.staffTitle = new Title();
		}
		return staffTitle;
	}
	public void setStaffTitle(Title staffTitle) {
		this.staffTitle = staffTitle;
	}
	
	
	/**
	 * Ա������
	 * @return ����Ա������ ���� ���� ���� �Ա� ���� ְ��
	 */
	public String introduction() {
		String str = "����:" + this.getStaffName()
		+"\n����:" + this.getStaffNo()
		+"\n�Ա�:" + this.getStaffSex()
		+"\n����:" + this.getStaffAge()
		+"\nְ��:" + this.getStaffDepartment().getDepartmentName() + this.getStaffTitle().getTitleName();
		return str;
	}
	
	
}

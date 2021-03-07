package com.imooc.model;

public class Staff {
	// 成员属性 : 员工工号、员工姓名、  员工性别、 员工年龄、 所在部门、职务
	private String staffNo;
	private String staffName;
	private String staffSex;
	private int staffAge;
	private Department staffDepartment;
	private Title staffTitle;
	
	//无参构造函数
	public Staff() {}
	
	// 有参构造函数
	public Staff(String staffNo,String staffName,String staffSex,int staffAge,Department staffDepartment,Title staffTitle) {
		this.setStaffNo(staffNo);
		this.setStaffName(staffName);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
		this.setStaffDepartment(staffDepartment);
		this.setStaffTitle(staffTitle);
	}
	
	
	// 员工编号
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	
	
	
	// 员工姓名
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	
	
	//员工性别
	public String getStaffSex() {
		return staffSex;
	}
	public void setStaffSex(String staffSex) {
		if(staffSex.equals("男") || staffSex.equals("女")) {
			this.staffSex = staffSex;
		}else {
			this.staffSex = "男";
		}
	}
	
	
	
	//员工年龄
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
	
	
	
	// 所在部门
	public Department getStaffDepartment() {
		if(this.staffDepartment == null) {
			this.staffDepartment = new Department();
		}
		return staffDepartment;
	}
	public void setStaffDepartment(Department staffDepartment) {
		this.staffDepartment = staffDepartment;
	}
	
	
	
	//职务
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
	 * 员工介绍
	 * @return 返回员工介绍 包含 姓名 工号 性别 年龄 职务
	 */
	public String introduction() {
		String str = "姓名:" + this.getStaffName()
		+"\n工号:" + this.getStaffNo()
		+"\n性别:" + this.getStaffSex()
		+"\n年龄:" + this.getStaffAge()
		+"\n职务:" + this.getStaffDepartment().getDepartmentName() + this.getStaffTitle().getTitleName();
		return str;
	}
	
	
}

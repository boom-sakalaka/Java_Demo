package com.imooc.model;

public class Department {
	// 成员属性: 部门编号 部门名字 部门成员信息 部门成员数量
	private String departmentNo;
	private String departmentName;
	private Staff departmentMember[];
	private int departmentMemberNum;
	
	// 无参构造函数
	public Department () {}
	
	// 有参构造函数
	public Department(String departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}
	
	
	// 部门编号
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	// 部门名字
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	// 部门成员信息
	public Staff[] getDepartmentMember() {
		if(this.departmentMember == null) {
			this.departmentMember = new Staff[3];
		}
		return departmentMember;
	}
	public int getDepartmentMemberNum() {
		return departmentMemberNum;
	}

	// 部门成员数量
	public void setDepartmentMemberNum(int departmentMemberNum) {
		this.departmentMemberNum = departmentMemberNum;
	}

	public void setDepartmentMember(Staff[] departmentMember) {
		this.departmentMember = departmentMember;
	}

	/**
	 * 把员工存在部门员工信息数组内
	 */
	public void addDepartmentMenber(Staff st) {
		/**
		 * 1.将员工保存到数组中
		 * 2.将员工个数保存到departmentMemberNum
		 */ 
		for(int i = 0; i<this.getDepartmentMember().length;i++) {
			if(this.getDepartmentMember()[i] == null) {
				this.getDepartmentMember()[i] = st;
				this.departmentMemberNum = i+1;
				return;
			}
		}
		
	}

	/**
	 * 统计部门共有几名员工
	 * @return 返回部门员工数量
	 */
	public String showDepartmentNumInfo() {
		String str = this.getDepartmentName() +"共有"+ this.getDepartmentMemberNum() + "名员工";
		return str;
	}	
	
	
	/**
	 * 介绍部门员工具体信息的方法
	 * @return 返回部门员工具体信息
	 */
	public String introduction() {
		String str = "";
		for(int i = 0; i< this.getDepartmentMember().length;i++) {
			// 防止空指针异常
			if(this.getDepartmentMember()[i] != null) {
				str += "姓名:" + this.getDepartmentMember()[i].getStaffName()
						+"\n工号:" + this.getDepartmentMember()[i].getStaffNo()
						+"\n性别:" + this.getDepartmentMember()[i].getStaffSex()
						+"\n年龄:" + this.getDepartmentMember()[i].getStaffAge()
						+"\n职务:" + this.getDepartmentMember()[i].getStaffDepartment().getDepartmentName() 
						+ this.getDepartmentMember()[i].getStaffTitle().getTitleName()
						+"\n===============\n";
			}
		}		
		return str;
	}
}

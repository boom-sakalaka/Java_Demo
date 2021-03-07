package com.imooc.model;

public class Department {
	// ��Ա����: ���ű�� �������� ���ų�Ա��Ϣ ���ų�Ա����
	private String departmentNo;
	private String departmentName;
	private Staff departmentMember[];
	private int departmentMemberNum;
	
	// �޲ι��캯��
	public Department () {}
	
	// �вι��캯��
	public Department(String departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}
	
	
	// ���ű��
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	// ��������
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	// ���ų�Ա��Ϣ
	public Staff[] getDepartmentMember() {
		if(this.departmentMember == null) {
			this.departmentMember = new Staff[3];
		}
		return departmentMember;
	}
	public int getDepartmentMemberNum() {
		return departmentMemberNum;
	}

	// ���ų�Ա����
	public void setDepartmentMemberNum(int departmentMemberNum) {
		this.departmentMemberNum = departmentMemberNum;
	}

	public void setDepartmentMember(Staff[] departmentMember) {
		this.departmentMember = departmentMember;
	}

	/**
	 * ��Ա�����ڲ���Ա����Ϣ������
	 */
	public void addDepartmentMenber(Staff st) {
		/**
		 * 1.��Ա�����浽������
		 * 2.��Ա���������浽departmentMemberNum
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
	 * ͳ�Ʋ��Ź��м���Ա��
	 * @return ���ز���Ա������
	 */
	public String showDepartmentNumInfo() {
		String str = this.getDepartmentName() +"����"+ this.getDepartmentMemberNum() + "��Ա��";
		return str;
	}	
	
	
	/**
	 * ���ܲ���Ա��������Ϣ�ķ���
	 * @return ���ز���Ա��������Ϣ
	 */
	public String introduction() {
		String str = "";
		for(int i = 0; i< this.getDepartmentMember().length;i++) {
			// ��ֹ��ָ���쳣
			if(this.getDepartmentMember()[i] != null) {
				str += "����:" + this.getDepartmentMember()[i].getStaffName()
						+"\n����:" + this.getDepartmentMember()[i].getStaffNo()
						+"\n�Ա�:" + this.getDepartmentMember()[i].getStaffSex()
						+"\n����:" + this.getDepartmentMember()[i].getStaffAge()
						+"\nְ��:" + this.getDepartmentMember()[i].getStaffDepartment().getDepartmentName() 
						+ this.getDepartmentMember()[i].getStaffTitle().getTitleName()
						+"\n===============\n";
			}
		}		
		return str;
	}
}

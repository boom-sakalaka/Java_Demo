package com.imooc.model;

public class Title {
	// ��Ա����: ְ���� ְ������
	private String titleNo;
	private String titleName;
	
	// �޲ι��췽��
	public Title () {}
	
	// �вι��췽��
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

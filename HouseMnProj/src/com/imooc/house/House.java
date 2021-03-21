package com.imooc.house;

public class House {
	private int houseId;
	private String houseName;
	private String houseAddress;
	private String houseType;
	
	public House() {}
	
	public House(int houseId, String houseName,String houseAddress, String houseType) {
		this.setHouseId(houseId);
		this.setHouseName(houseName);
		this.setHouseAddress(houseAddress);
		this.setHouseType(houseType);
	}
	
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	
	public String toString() {
		return "��Դ���ͣ�"+ this.getHouseId() 
		+"\n��Դ���ƣ�"+ this.getHouseName() 
		+"\n��Դ��ַ��"+ this.getHouseAddress() 
		+"\n�������ͣ�" + this.getHouseType()
		+ "\n----------------------------------------";
	}
	
	public String toStringTwo() {
		return "��Դ���		��Դ����\n" + this.getHouseId() + "			" + this.getHouseName();
	}
}

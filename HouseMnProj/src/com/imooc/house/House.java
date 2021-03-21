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
		return "房源类型："+ this.getHouseId() 
		+"\n房源名称："+ this.getHouseName() 
		+"\n房源地址："+ this.getHouseAddress() 
		+"\n房屋类型：" + this.getHouseType()
		+ "\n----------------------------------------";
	}
	
	public String toStringTwo() {
		return "房源编号		房源名称\n" + this.getHouseId() + "			" + this.getHouseName();
	}
}

package com.imooc.mgallery.entity;

public class Painting {
	private Integer id; // �ͻ����
	private String pname;// ����
	private Integer category; // ���� 1-��ʵ���� 2-��������
	private Integer price; // �۸�
	private String preview; //�ͻ�ͼƬ��ַ
	private String description; // ����
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}

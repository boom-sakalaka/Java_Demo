package com.imooc.model;

public class Fruits {
	private String shape;
	private String taste;
	
	public Fruits() {}
	
	public Fruits(String shape,String taste) {
		this.setShape(shape);
		this.setTaste(taste);
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public void eat () {
		System.out.println("水果可供人们食用!");
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Fruits temp = (Fruits)obj;
		if(this.getShape().equals(temp.getShape()) 
				&& this.getTaste().equals(temp.getTaste())) {
			return true;
		}else {
			return false;
		}
	}
	
}

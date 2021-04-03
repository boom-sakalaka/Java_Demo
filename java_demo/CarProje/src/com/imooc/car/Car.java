package com.imooc.car;

public class Car {
    //属性：车的颜色color、车主姓名userName
	private String color;
	private String userName;

	public Car(){
		
	}
	//带参构造函数（参数为color和userName）
	public Car(String color,String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}
	

    //通过封装实现对私有属性的get/set操作
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
    //创建无参无返回值得方法use（描述内容为：我是机动车！）
	public void use() {
		System.out.println("我是机动车!");
	}

	//重写equals方法，比较两个对象是否相等（比较color，userName）
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Car temp = (Car)obj;
		if(this.getColor().equals(temp.getColor()) 
				&& this.getUserName().equals(temp.getUserName())) {
			return true;
		}else {
			return false;
		}
	}
}

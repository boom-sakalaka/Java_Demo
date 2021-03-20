package com.imooc.employee;

public class Employee {
	private int id;
	private String  name;
	private double salary;
	
	public Employee() {}

	public Employee(int id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

package com.imooc.comparable;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
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

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		double salary1 = this.getSalary();
		double salary2 = o.getSalary();
		int n = new Double(salary2 - salary1).intValue();
		return n;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "员工[编号：emp"+ this.getId() 
		+"，姓名："+ this.getName() 
		+"，工资："+ this.getSalary() +"]";
	}
	

}

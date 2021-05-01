package com.imooc.json;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
	private int empno;
	private String ename;
	private String job;
	@JSONField(name="hiredate",format="yyyy-MM-dd")
	private Date hdata;
	private Float salary;
	private String dname;
	
	public Employee () {
		
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHdata() {
		return hdata;
	}
	public void setHdata(Date hdata) {
		this.hdata = hdata;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
}

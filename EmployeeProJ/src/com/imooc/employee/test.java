package com.imooc.employee;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList employeeList = new ArrayList();
		
		Employee em1 = new Employee(1,"����",5000.0);
		Employee em2 = new Employee(1,"����",5500.0);
		Employee em3 = new Employee(1,"����",4000.0);
		
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		
		System.out.println("Ա������      Ա��н��");
		for(int i = 0; i< employeeList.size(); i++) {
			System.out.println(((Employee)employeeList.get(i)).getName() 
					+ "      "
					+ ((Employee)employeeList.get(i)).getSalary());
		}
		
	}

}

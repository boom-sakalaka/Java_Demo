package com.imooc.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FashJsonSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List emplist = new ArrayList();
		for(int i =1; i<=100; i++) {
			Employee employee = new Employee();
			employee.setEmpno(4488 + i);
			employee.setEname("Ô±¹¤" + i);
			emplist.add(employee);
		}
		String json =  JSON.toJSONString(emplist);
		System.out.println(json);
		List<Employee> emps =  JSON.parseArray(json,Employee.class);
		for(Employee e : emps) {
			System.out.println(e.getEmpno());
		}
		
	}

}

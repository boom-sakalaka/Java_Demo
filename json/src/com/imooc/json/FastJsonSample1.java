package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {
	public static void main (String [] args) {
		Employee employee = new Employee();
		employee.setEmpno(4488);
		employee.setDname("王晓东");
		employee.setJob("客户经理");
		employee.setSalary(10000f);
		employee.setEname("市场部");
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 30, 0, 0, 0);
		employee.setHdata(c.getTime());
		 
		//FashJson 对象转json
		String json =  JSON.toJSONString(employee);
		System.out.println(json);
		Employee emp =   JSON.parseObject(json,Employee.class);
		System.out.println(emp.getDname());
		
	}
}

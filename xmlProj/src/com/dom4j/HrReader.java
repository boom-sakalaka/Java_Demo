package com.dom4j;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HrReader {
	public void readXml() {
		String file = "G:\\work_space\\Java_Demo\\xmlProj\\src\\hr.schema.xml";
		// SAXReader 类是读取XML文件的核心类，用于将XML解析后以 ‘树’的形式保存在内存中
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			// 获取XML 文档的根节点 即hr标签
			Element root =  document.getRootElement();
			// elements 方法用于获取指定标签的集合
			 List<Element> employees = root.elements("employee");
			 for (Element employee : employees) {
				 // element 方法用于获取唯一的子节点对象
				  Element name =  employee.element("name");
				  Element department = employee.element("department");
				  String empName = name.getText(); // getText()方法用于获取标签文本
				  System.out.println(empName);
				  System.out.println(employee.elementText("age"));
				  System.out.println(department.elementText("dname"));
				  System.out.println(department.elementText("address"));
				  Attribute att = employee.attribute("no");
				  System.out.println(att.getText());
				  System.out.println("==============================");
			 }
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String [] args) {
		HrReader reader = new HrReader();
		reader.readXml();
	}
}

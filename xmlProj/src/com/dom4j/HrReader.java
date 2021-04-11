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
		// SAXReader ���Ƕ�ȡXML�ļ��ĺ����࣬���ڽ�XML�������� ����������ʽ�������ڴ���
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			// ��ȡXML �ĵ��ĸ��ڵ� ��hr��ǩ
			Element root =  document.getRootElement();
			// elements �������ڻ�ȡָ����ǩ�ļ���
			 List<Element> employees = root.elements("employee");
			 for (Element employee : employees) {
				 // element �������ڻ�ȡΨһ���ӽڵ����
				  Element name =  employee.element("name");
				  Element department = employee.element("department");
				  String empName = name.getText(); // getText()�������ڻ�ȡ��ǩ�ı�
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

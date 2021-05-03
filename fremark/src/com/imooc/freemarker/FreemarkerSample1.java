package com.imooc.freemarker;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class FreemarkerSample1 {
	public static void main(String [] args) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		// 	1.����ģ��
		// �����������ö���
		Configuration config = new Configuration(Configuration.VERSION_2_3_28);
		// ���ü��ص�Ŀ¼
		config.setClassForTemplateLoading(FreemarkerSample1.class, "");
		// �õ�ģ�����
		Template t =  config.getTemplate("sample1.ftl");
		//2.��������
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("site","�ٶ�");
		data.put("url", "http://www.baidu.com");
		// �������
		t.process(data, new OutputStreamWriter(System.out));
	}
}

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
		// 	1.加载模板
		// 创建核心配置对象
		Configuration config = new Configuration(Configuration.VERSION_2_3_28);
		// 设置加载的目录
		config.setClassForTemplateLoading(FreemarkerSample1.class, "");
		// 得到模板对象
		Template t =  config.getTemplate("sample1.ftl");
		//2.创建数据
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("site","百度");
		data.put("url", "http://www.baidu.com");
		// 产生输出
		t.process(data, new OutputStreamWriter(System.out));
	}
}

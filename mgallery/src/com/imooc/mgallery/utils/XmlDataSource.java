package com.imooc.mgallery.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.imooc.mgallery.entity.Painting;

/*
 * 数据源类，用于将XML 文件解析为java对象
 * */
public class XmlDataSource {
	// 通过static静态关键字保证数据全局唯一
	private static List<Painting> data = new ArrayList();
	private static String dataFile;
	static {
		dataFile = XmlDataSource.class.getResource("/painting.xml").getPath();
		URLDecoder decoder = new URLDecoder();
		try {
			dataFile = decoder.decode(dataFile,"UTF-8");
			//System.out.println(dataFile);
			//利用DOM4j 对xml进行解析
			SAXReader reader = new SAXReader();
			// 1.获取Document 文档对象
			Document document = reader.read(dataFile);
			//2.Xpath 得到xml节点集合
			List<Node> nodes =  document.selectNodes("/root/painting");
			//遍历
			for(Node node : nodes) {
				Element element = (Element)node;
				String id = element.attributeValue("id");
				String pname = element.elementText("pname");
				
				Painting painting = new Painting();
				painting.setId(Integer.parseInt(id));
				painting.setPname(pname);
				painting.setCategory((Integer.parseInt(element.elementText("category"))));
				painting.setPrice((Integer.parseInt(element.elementText("price"))));
				painting.setPreview(element.elementText("preview"));
				painting.setDescription(element.elementText("description"));
				data.add(painting);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<Painting> getRawData () {
		return data;
	}
	public static void main(String [] args) {
		List<Painting> ps = XmlDataSource.getRawData();
		System.out.println(ps);
	}
}

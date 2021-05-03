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
 * ����Դ�࣬���ڽ�XML �ļ�����Ϊjava����
 * */
public class XmlDataSource {
	// ͨ��static��̬�ؼ��ֱ�֤����ȫ��Ψһ
	private static List<Painting> data = new ArrayList();
	private static String dataFile;
	static {
		dataFile = XmlDataSource.class.getResource("/painting.xml").getPath();
		URLDecoder decoder = new URLDecoder();
		try {
			dataFile = decoder.decode(dataFile,"UTF-8");
			//System.out.println(dataFile);
			//����DOM4j ��xml���н���
			SAXReader reader = new SAXReader();
			// 1.��ȡDocument �ĵ�����
			Document document = reader.read(dataFile);
			//2.Xpath �õ�xml�ڵ㼯��
			List<Node> nodes =  document.selectNodes("/root/painting");
			//����
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

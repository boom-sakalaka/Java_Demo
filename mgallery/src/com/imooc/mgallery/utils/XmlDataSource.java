package com.imooc.mgallery.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/*
 * ����Դ�࣬���ڽ�XML �ļ�����Ϊjava����
 * */
public class XmlDataSource {
	// ͨ��static��̬�ؼ��ֱ�֤����ȫ��Ψһ
	private static List data = new ArrayList();
	private static String dataFile;
	static {
		dataFile = XmlDataSource.class.getResource("/painting.xml").getPath();
		URLDecoder decoder = new URLDecoder();
		try {
			dataFile = decoder.decode(dataFile,"UTF-8");
			System.out.println(dataFile);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String [] args) {
		new XmlDataSource();
	}
}

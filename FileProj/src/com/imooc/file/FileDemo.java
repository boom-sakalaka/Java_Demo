package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String [] args) {
		// ����File ����
//		File file1 = new File("C:\\Users\\GZH\\Desktop\\test.txt");
//		File file1 = new File("C:\\Users\\GZH\\Desktop","\\test.txt");
		File file = new File("C:\\Users\\GZH\\Desktop");
		File file1 = new File(file,"\\test.txt");
		// �ж��� �ļ�����Ŀ¼
		System.out.println("�Ƿ���Ŀ¼" + file1.isDirectory());
		System.out.println("�Ƿ���Ŀ¼" + file1.isFile());
		
		// �����ļ�
		File file2 = new File("C:\\Users\\GZH\\Desktop","\\set\\HashSet");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

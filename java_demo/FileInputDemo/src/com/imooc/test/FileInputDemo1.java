package com.imooc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
	public static void main(String [] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\GZH\\Desktop\\test.txt");
			int n = 0;
			while((n = fis.read()) != -1) {
				System.out.println((char)n);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

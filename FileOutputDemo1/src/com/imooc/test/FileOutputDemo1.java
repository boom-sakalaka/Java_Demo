package com.imooc.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:\\Users\\GZH\\Desktop\\test.txt",true);
			fos.write(50);
			fos.write('a');
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

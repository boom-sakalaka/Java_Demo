package com.imooc.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GoodsTest {
	public static void main (String [] args) {
		// ����Goods ��Ķ���
		Goods goods1 = new Goods("gdoo1","����",3000);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\GZH\\Desktop\\test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("C:\\Users\\GZH\\Desktop\\test.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			// ������д���ļ�
			oos.writeObject(goods1);
			oos.flush();
			
			// ������
			try {
				Goods goods = (Goods) ois.readObject();
				System.out.println(goods);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			oos.close();
			fos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

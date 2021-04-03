package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java 编程 基础";
		System.out.println("字符串的长度是:" + str.length());
		
		// 取出字符 程 并输出
		System.out.println(str.charAt(6));
		
		// 取出 子串 编程 基础
		System.out.println(str.substring(5));
		
		// 取出 子串 编程
		System.out.println(str.substring(5,7));
		
		
		
	}

}

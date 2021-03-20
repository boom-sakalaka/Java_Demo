package com.imooc.list;

import java.util.ArrayList;

public class ListDemo1 {

	public static void main(String[] args) {
		// 用ArrayList 存储数据
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("swift");
		
		// 输出列表中元素的个数
		System.out.println("列表中元素的个数为:" + list.size());
		
		// 遍历输出所有的编程语言
		System.out.println("==========================");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "====");
		}
		
		
		// 移除 C++
		list.remove(2);
		//list.remove("C++");
		System.out.println("==========================");
		System.out.println("移除C++数据后");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "====");
		}
		
	}

}

package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {
	public static void main (String [] args) {
		Map<String,String> animal = new HashMap<String,String>();
		
		System.out.println("请输入三组单词对应的注释，并存到hashMap中去");
		Scanner sc = new Scanner(System.in);
		// 添加数据
		int i = 0;
		while(i < 3) {
			System.out.println("请输入key(单词)值:");
			String key = sc.next();
			System.out.println("请输入value(注释)值:");
			String value = sc.next();
			animal.put(key,value);
			i++;
		}
		
		System.out.println("*************************");
		System.out.println("使用迭代器输出所有的value");
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "   ");
		}
		
		System.out.println("*************************");
		System.out.println("打印key和value的值");
		// entryset方法
		Set<Entry<String,String>> entrySet = animal.entrySet();
		
		for(Entry<String,String> entry : entrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "    ");
		}
		
		
	}
}

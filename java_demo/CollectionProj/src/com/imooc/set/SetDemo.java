package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String [] args) {
		Set set = new HashSet();
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		
		// 集合中插入新的单词
		set.add("green");
		
		// 插入重复元素 不报错，不过也不会再次添加
		set.add("green");
		
		// 显示集合内容
		System.out.println("显示集合中数据");
		Iterator it = set.iterator();
		// 遍历迭代器
		while(it.hasNext()) {
			System.out.print(it.next() + "    ");
		}
	}
}

package com.imooc.singleton;
// 饿汉式 创建对象实例的时候直接初始化
public class SingletonOne {
	// 创建类中的私有构造
	private SingletonOne () {}
	
	// 创建该类型的私有静态实例
	private static SingletonOne instance = new SingletonOne();
	
	public static SingletonOne getInstance() {
		return instance;
	}
	
	
}

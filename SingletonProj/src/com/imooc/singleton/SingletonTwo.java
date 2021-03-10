package com.imooc.singleton;
// 懒汉式 : 类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才实例化
public class SingletonTwo {
	// 创建私有构造方法
	private SingletonTwo() {}
	
	// 2、创建静态的该类实例对象
	private static SingletonTwo instance = null;
	
	// 3、创建开放的静态方法提供实例对象
	
	public static SingletonTwo getInstance () {
		if(instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}
}

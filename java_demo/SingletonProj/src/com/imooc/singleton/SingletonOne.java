package com.imooc.singleton;
// ����ʽ ��������ʵ����ʱ��ֱ�ӳ�ʼ��
public class SingletonOne {
	// �������е�˽�й���
	private SingletonOne () {}
	
	// ���������͵�˽�о�̬ʵ��
	private static SingletonOne instance = new SingletonOne();
	
	public static SingletonOne getInstance() {
		return instance;
	}
	
	
}

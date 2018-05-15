package com.zhanbq.performanceoptimazation.CH2.javatuning.ch2.singleton;

public class SingletonFactory {
	private SingletonFactory() {
		//���������Ĺ��̿��ܻ�Ƚ���
		System.out.println("Singleton is create");
	}

	private static SingletonFactory instance = new SingletonFactory();
	public static SingletonFactory getInstance() {
		return instance;
	} 
}
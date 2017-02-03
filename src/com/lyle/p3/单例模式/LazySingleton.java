package com.lyle.p3.单例模式;

/**
 * @ClassName: Singleton
 * @Description: 饿汉模式
 * @author: Lyle
 * @date: 2017年1月24日 下午1:50:15
 */
public class LazySingleton {

	/*
	 * 私有静态实例
	 */
	private static LazySingleton single = new LazySingleton();

	/*
	 * 私有构造器
	 */
	private LazySingleton() {
	}

	/*
	 * 静态方法，创建实例
	 */
	public static LazySingleton getInstance() {
		return single;
	}
}

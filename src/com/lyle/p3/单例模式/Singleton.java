package com.lyle.p3.单例模式;

/**
 * @ClassName: Singleton
 * @Description: 饿汉模式
 * @author: Lyle
 * @date: 2017年1月24日 下午1:50:15
 */
public class Singleton {

	/*
	 * 私有静态实例
	 */
	private static Singleton single = new Singleton();

	/*
	 * 私有构造器
	 */
	private Singleton() {
	}

	/*
	 * 静态方法，创建实例
	 */
	public static Singleton getInstance() {
		return single;
	}
}

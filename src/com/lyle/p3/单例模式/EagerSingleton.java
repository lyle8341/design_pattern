package com.lyle.p3.单例模式;

/**
 * @ClassName: EagerSingleton
 * @Description: 饱汉模式
 * @author: Lyle
 * @date: 2017年1月24日 下午1:50:15
 */
public class EagerSingleton {

	/*
	 * 私有静态实例
	 */
	private static EagerSingleton single = null;

	/*
	 * 私有构造器
	 */
	private EagerSingleton() {
	}

	/*
	 * 静态方法，创建实例
	 */
	public static EagerSingleton getInstance() {
		if (null == single) {
			synchronized (EagerSingleton.class) {
				if (null == single) {
					single = new EagerSingleton();
				}
			}
		}
		return single;
	}
}

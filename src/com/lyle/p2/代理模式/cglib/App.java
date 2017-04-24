package com.lyle.p2.代理模式.cglib;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年4月24日 下午2:23:06
 */
public class App {

	public static void main(String[] args) {
		// 目标对象
		UserDao target = new UserDao();
		System.out.println(target.getClass());
		// 代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}
}

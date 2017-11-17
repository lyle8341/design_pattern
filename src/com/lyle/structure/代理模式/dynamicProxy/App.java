package com.lyle.structure.代理模式.dynamicProxy;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年4月24日 下午2:03:37
 */
public class App {

	public static void main(String[] args) {
		UserDao target = new Target();// 目标对象
		// 原始的类型class Target
		System.out.println(target.getClass());
		// 给目标对象，创建代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		// 内存中动态生成的代理对象class com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass());
		proxy.save();
	}
}

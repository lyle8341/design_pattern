package com.lyle.structure.代理模式.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Description:动态代理也叫做:JDK代理,接口代理
 * @author: Lyle
 * @date: 2017年4月24日 下午1:48:43
 */
public class ProxyFactory {

	private Object target;// 目标对象

	public ProxyFactory(Object target) {
		this.target = target;
	}
	// 给目标对象生成代理对象

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始事务...");
						Object result = method.invoke(target, args);
						System.out.println("提交事务...");
						return result;
					}
				});
	}
}

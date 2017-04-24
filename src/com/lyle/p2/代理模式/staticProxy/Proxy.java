package com.lyle.p2.代理模式.staticProxy;

/**
 * @ClassName: Proxy
 * @Description: 代理对象
 * @author: Lyle
 * @date: 2017年4月24日 下午1:37:05
 */
public class Proxy implements UserDao {

	private UserDao target;

	public Proxy(UserDao target) {
		this.target = target;
	}

	@Override
	public void save() {
		System.out.println("开始事务...");
		target.save();
		System.out.println("提交事务...");
	}
}

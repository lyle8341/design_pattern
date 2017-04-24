package com.lyle.p2.代理模式.staticProxy;

/**
 * @ClassName: Target
 * @Description: 目标读写
 * @author: Lyle
 * @date: 2017年4月24日 下午1:35:56
 */
public class Target implements UserDao {

	@Override
	public void save() {
		System.out.println("--已经保存数据--");
	}
}

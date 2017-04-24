package com.lyle.p2.代理模式.cglib;

/**
 * @ClassName: UserDao
 * @Description:目标对象，没有实现任何接口
 * @author: Lyle
 * @date: 2017年4月24日 下午2:14:16
 */
public class UserDao {

	public void save() {
		System.out.println("--已经保存数据--");
	}
}

package com.lyle.p9.模板方法模式;

/**
 * @ClassName: Examination
 * @Description: 入学考试
 * @author: Lyle
 * @date: 2017年2月3日 下午1:39:47
 */
public abstract class Examination {

	public void exam() {
		entranceRoom();
		before();
		doing();
		after();
	}

	protected abstract void entranceRoom();// 进入考场

	protected abstract void before();// 考前准备

	protected abstract void doing();// 考试

	protected abstract void after();// 结束
}

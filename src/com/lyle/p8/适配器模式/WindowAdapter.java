package com.lyle.p8.适配器模式;

/**
 * @ClassName: WindowAdapter
 * @Description:实现接口中所有方法，空实现，抽象类
 * @author: Lyle
 * @date: 2017年2月3日 上午10:04:35
 */
public abstract class WindowAdapter implements Window {

	@Override
	public void open() {
	}

	@Override
	public void close() {
	}

	@Override
	public void iconified() {
	}

	@Override
	public void deiconified() {
	}

	@Override
	public void activated() {
	}
}

package com.lyle.p8.适配器模式;

/**
 * @ClassName: WindowImpl
 * @Description: 子类选择性实现需要的方法
 * @author: Lyle
 * @date: 2017年2月3日 上午10:05:49
 */
public class WindowImpl extends WindowAdapter {

	@Override
	public void open() {
		System.out.println("WindowImpl.open()");
	}

	@Override
	public void close() {
		System.out.println("WindowImpl.close()");
	}
}

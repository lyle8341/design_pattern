package com.lyle.p8.适配器模式;

/**
 * @ClassName: Window
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 上午10:02:47
 */
public interface Window {

	void open();// 窗口打开

	void close();// 窗口关闭

	void iconified();// 窗口最小化

	void deiconified();// 窗口恢复

	void activated();// 窗口活动
}

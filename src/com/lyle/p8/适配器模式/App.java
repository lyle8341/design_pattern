package com.lyle.p8.适配器模式;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 上午10:11:58
 */
public class App {

	public static void main(String[] args) {
		Window win = new WindowImpl();
		win.open();
		win.close();
	}
}

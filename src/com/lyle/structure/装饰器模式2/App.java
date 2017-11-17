package com.lyle.structure.装饰器模式2;

/**
 * @ClassName: App
 * @Description: 扩音器
 * @author: Lyle
 * @date: 2017年2月14日 下午9:09:14
 */
public class App {

	public static void main(String[] args) {
		Voice v = new Voice();
		v.say();
		Amplifier am = new Amplifier(v);
		am.say();
	}
}

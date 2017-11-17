package com.lyle.structure.代理模式.staticProxy;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年4月24日 下午1:41:39
 */
public class App {

	public static void main(String[] args) {
		Target target = new Target();
		Proxy p = new Proxy(target);
		p.save();
	}
}

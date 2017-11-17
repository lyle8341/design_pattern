package com.lyle.behavior.中介者模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:45:18
 */
public class App {

	public static void main(String[] args) {
		AbstractColleague kongrong = new KongRong();
		AbstractColleague kongbrother = new KongBrother();
		AbstractMediator am = new Mediator(kongrong, kongbrother);
		System.out.println("k->b");
		kongrong.sharePear(0.4f, am);
		System.out.println(kongrong.getPear());
		System.out.println(kongbrother.getPear());
	}
}

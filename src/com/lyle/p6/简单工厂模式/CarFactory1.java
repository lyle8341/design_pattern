package com.lyle.p6.简单工厂模式;

/**
 * @ClassName: CarFactory1
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年3月14日 下午9:23:58
 */
public class CarFactory1 {

	public static Car createBYD() {
		return new BYD();
	}

	public static Car createWLHG() {
		return new WLHG();
	}
}

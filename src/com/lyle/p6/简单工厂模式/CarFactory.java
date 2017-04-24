package com.lyle.p6.简单工厂模式;

/**
 * @ClassName: CarFactory
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年3月14日 下午9:17:21
 */
public class CarFactory {

	public static Car createCar(String type) {
		if ("BYD".equalsIgnoreCase(type)) {
			return new BYD();
		} else if ("WLHG".equalsIgnoreCase(type)) {
			return new WLHG();
		} else {
			return null;
		}
	}
}

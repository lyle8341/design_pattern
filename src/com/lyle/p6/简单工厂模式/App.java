package com.lyle.p6.简单工厂模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年3月14日 下午9:21:39
 */
public class App {

	public static void main(String[] args) {
		// Car c1 = CarFactory.createCar("byd");
		// Car c2 = CarFactory.createCar("wlhg");
		Car c1 = CarFactory1.createBYD();
		Car c2 = CarFactory1.createWLHG();
		c1.run();
		c2.run();
	}
}

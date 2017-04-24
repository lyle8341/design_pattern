package com.lyle.p5.工厂方法模式;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年3月14日 下午9:42:41
 */
public class App {

	public static void main(String[] args) {
		Car c = new BYDFactory().createCar();
		c.run();
	}
}

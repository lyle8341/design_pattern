package com.lyle.p5.工厂方法模式;

/**
 * @ClassName: BYDFactory
 * @Description:
 * @author: Lyle
 * @date: 2017年3月14日 下午9:36:18
 */
public class BYDFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new BYD();
	}
}

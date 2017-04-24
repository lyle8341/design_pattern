package com.lyle.p6.简单工厂模式;

/**
 * @ClassName: BYD
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年3月14日 下午9:12:32
 */
public class BYD implements Car {

	@Override
	public void run() {
		System.out.println("250km/h");
	}
}

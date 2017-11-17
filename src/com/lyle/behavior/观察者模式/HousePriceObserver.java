package com.lyle.behavior.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: HousePriceObserver
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 上午9:47:22
 */
public class HousePriceObserver implements Observer {

	private String name;

	/**
	 * @Title:HousePriceObserver
	 * @Description:TODO
	 */
	public HousePriceObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// 只要改变了 observable 对象就调用此方法
		if (arg instanceof Float) {
			System.out.println(this.name + "观察的价格更改为:" + ((Float) arg).floatValue());
		}
	}
}

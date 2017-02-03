package com.lyle.p16.观察者模式;

import java.util.Observable;

/**
 * @ClassName: House
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 上午9:42:58
 */
public class House extends Observable {

	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.setChanged();// 设置变化点
		this.notifyObservers(price);// 通知所有观察者价格改变
		this.price = price;
	}

	public House(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "房子的价格为： " + this.price;
	}
}

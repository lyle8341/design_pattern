package com.lyle.behavior.策略模式;

/**
 * @ClassName: Price
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:50:11
 */
public class Price {

	// 持有一个具体的策略对象
	private MemberStrategy strategy;

	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}

	public double quote(double price) {
		return this.strategy.calPrice(price);
	}
}

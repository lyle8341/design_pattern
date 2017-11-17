package com.lyle.behavior.策略模式;

/**
 * @ClassName: PrimaryMemStrategy
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:45:49
 */
public class PrimaryMemStrategy implements MemberStrategy {

	@Override
	public double calPrice(double price) {
		System.out.println("对于初级会员的没有折扣");
		return price;
	}
}

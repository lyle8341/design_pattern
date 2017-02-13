package com.lyle.p1.策略模式;

/**
 * @ClassName: MiddleMemStrategy
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:47:30
 */
public class MiddleMemStrategy implements MemberStrategy {

	@Override
	public double calPrice(double price) {
		System.out.println("中初级会员的10%折扣");
		return price * 0.9;
	}
}

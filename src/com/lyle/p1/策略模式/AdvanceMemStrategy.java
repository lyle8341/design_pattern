package com.lyle.p1.策略模式;

/**
 * @ClassName: AdvanceMemStrategy
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:49:13
 */
public class AdvanceMemStrategy implements MemberStrategy {

	@Override
	public double calPrice(double price) {
		System.out.println("高初级会员的20%折扣");
		return price * 0.8;
	}
}

package com.lyle.p13.装饰器模式;

/**
 * @ClassName: Decorator
 * @Description:
 * @author: Lyle
 * @date: 2017年2月7日 下午2:18:27
 */
public abstract class Decorator implements Basket {

	private Basket basket;

	public Decorator(Basket basket) {
		this.basket = basket;
	}

	@Override
	public void store() {
		basket.store();
	}
}

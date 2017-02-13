package com.lyle.p13.装饰器模式;

/**
 * @ClassName: FruitBasket
 * @Description: 水果篮
 * @author: Lyle
 * @date: 2017年2月7日 下午2:10:38
 */
public class FruitBasket implements Basket {

	@Override
	public void store() {
		System.out.println("水果篮中有：");
	}
}

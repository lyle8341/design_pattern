package com.lyle.p13.装饰器模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月7日 下午2:17:19
 */
public class App {

	public static void main(String[] args) {
		Basket b = new FruitBasket();
		System.out.println("==========装饰前=========");
		b.store();
		System.out.println("===========被A装饰===========");
		Basket bA = new ConcreteDecoratorA(b);
		bA.store();
		System.out.println("===========被B装饰===========");
		Basket bB = new ConcreteDecoratorB(b);
		bB.store();
	}
}

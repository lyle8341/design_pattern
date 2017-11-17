package com.lyle.structure.装饰器模式;

/**
 * @ClassName: ConcreteDecoratorA
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月7日 下午2:22:31
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Basket basket) {
		super(basket);
	}

	@Override
	public void store() {
		System.out.println("ConcreteDecoratorA.store()装饰start");
		super.store();
		System.out.println("ConcreteDecoratorA.store()装饰end");
	}
}

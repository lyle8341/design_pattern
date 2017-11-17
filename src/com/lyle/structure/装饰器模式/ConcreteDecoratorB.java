package com.lyle.structure.装饰器模式;

/**
 * @ClassName: ConcreteDecoratorB
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月7日 下午2:26:23
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Basket basket) {
		super(basket);
	}

	@Override
	public void store() {
		System.out.println("ConcreteDecoratorB.store()装饰start");
		super.store();
		System.out.println("ConcreteDecoratorB.store()装饰end");
	}
}

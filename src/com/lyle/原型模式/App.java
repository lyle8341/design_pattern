package com.lyle.原型模式;

public class App {

	public static void main(String[] args) {
		Prototype pro = new ConcretePrototype("prototype");
		Prototype pro2 = (Prototype)pro.clone();
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
	}
}
package com.lyle.工厂;

import com.lyle.简单工厂.ICar;

public class App {

	public static void main(String[] args) {
		AbstractFactory factory = new TopFactory();
		ICar car = factory.create();
	}
}

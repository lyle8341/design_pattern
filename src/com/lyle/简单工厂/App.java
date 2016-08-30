package com.lyle.简单工厂;

public class App {

	public static void main(String[] args) {
		ICar obj = CarSimpleFactory.create("toptype");
		
	}
}

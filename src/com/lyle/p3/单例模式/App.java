package com.lyle.p3.单例模式;

public class App {

	public static void main(String[] args) {
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();
		Singleton inst3 = Singleton.getInstance();
		System.out.println(inst1);
		System.out.println(inst2);
		System.out.print(inst3);
	}
}

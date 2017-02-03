package com.lyle.p3.单例模式;

public class App {

	public static void main(String[] args) {
		for (;;) {
			new Thread(() -> {
				int a = EagerSingleton.getInstance().hashCode();
				System.out.println(a);
			}).start();
		}
	}
}

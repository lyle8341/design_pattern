package com.lyle.create.多例模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 下午2:24:36
 */
public class App {

	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			
			System.out.println(Multipleton.getRandomInstance());
		}
	}
}

package com.lyle.create.原型模式.clone;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月17日 下午2:11:43
 */
public class App {

	public static void main(String[] args) {
		Test t = new Test();
		t.add("aa");
		t.add("bb");
		System.out.println("test:" + t.get());
		// 克隆
		Test t2 = t.clone();
		t2.add("cc");
		System.out.println("test2:" + t2.get());
		System.out.println("test:" + t.get());
	}
}

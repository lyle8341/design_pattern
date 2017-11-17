package com.lyle.behavior.迭代器模式;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 下午3:16:53
 */
public class App {

	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("a");
		ag.add("b");
		ag.add("c");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}

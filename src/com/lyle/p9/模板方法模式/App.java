package com.lyle.p9.模板方法模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午1:32:43
 */
public class App {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.exam();
		System.out.println("========");
		Teacher tea = new Teacher();
		tea.exam();
	}
}

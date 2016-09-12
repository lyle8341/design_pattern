package com.lyle.p12.命令模式;

public class App {

	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher(s);
		Invoke invoke = new Invoke(t);
		invoke.execute();
	}
}

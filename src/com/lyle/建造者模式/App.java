package com.lyle.建造者模式;

public class App {

	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person p = pd.constructPerson(new ManBuilder());
		System.out.println(p.getBody());
		System.out.println(p.getFoot());
		System.out.println(p.getHead());
	}
}
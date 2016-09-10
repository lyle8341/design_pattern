package com.lyle.单态模式;

public class Singleton {

	private static Singleton single;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance(){
		if(single == null){
			single = new Singleton();
		}
		return single;
	}
}

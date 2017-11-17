package com.lyle.create.原型模式.clone;

import java.util.ArrayList;
import java.util.List;

public class Test implements Cloneable {

	private ArrayList<String> list = new ArrayList<>();

	public void add(String index) {
		list.add(index);
	}

	public List<String> get() {
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Test clone() {
		try {
			Test test = (Test) super.clone();
			test.list = (ArrayList<String>) this.list.clone();
			return test;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

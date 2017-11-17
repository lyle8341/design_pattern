package com.lyle.behavior.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteIterator
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 下午3:07:55
 */
public class ConcreteIterator implements Iterator {

	private List<Object> list = new ArrayList<Object>();

	private int curson = 0;

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (hasNext()) {
			obj = this.list.get(curson++);
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		if (curson == list.size()) {
			return false;
		}
		return true;
	}
}

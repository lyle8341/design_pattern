package com.lyle.p14.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteAggregate
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:13:43
 */
public class ConcreteAggregate implements Aggregate {

	private List<Object> list = new ArrayList<Object>();

	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(list);
	}
}

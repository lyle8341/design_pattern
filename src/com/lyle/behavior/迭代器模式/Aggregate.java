package com.lyle.behavior.迭代器模式;

/**
 * @ClassName: Aggregate
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:12:40
 */
public interface Aggregate {

	void add(Object obj);

	void remove(Object obj);

	Iterator iterator();
}

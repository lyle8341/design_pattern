package com.lyle.p24.备忘录模式;

/**
 * @ClassName: MementoCaretaker
 * @Description: 备忘录管理者
 * @author: Lyle
 * @date: 2017年2月13日 下午3:51:26
 */
public class MementoCaretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}

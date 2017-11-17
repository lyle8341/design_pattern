package com.lyle.behavior.备忘录模式;

/**
 * @ClassName: Memento
 * @Description: 备忘录类
 * @author: Lyle
 * @date: 2017年2月13日 下午3:16:43
 */
public class Memento {

	private String label;

	private int x;

	private int y;

	public Memento(String label, int x, int y) {
		super();
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

package com.lyle.p24.备忘录模式;

/**
 * @ClassName: Chessman
 * @Description: 象棋棋子类
 * @author: Lyle
 * @date: 2017年2月13日 下午3:06:04
 */
public class Chessman {

	private String label;

	private int x;

	private int y;

	public Chessman(String label, int x, int y) {
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

	public Memento save() {
		return new Memento(label, x, y);
	}

	public void restore(Memento m) {
		this.label = m.getLabel();
		this.x = m.getX();
		this.y = m.getY();
	}
}

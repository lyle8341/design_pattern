package com.lyle.p24.备忘录模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 下午3:52:42
 */
public class App {

	public static void main(String[] args) {
		MementoCaretaker mc = new MementoCaretaker();
		Chessman chess = new Chessman("马", 1, 1);
		display(chess);
		mc.setMemento(chess.save());// 保存状态
		chess.setY(4);
		display(chess);
		mc.setMemento(chess.save());
		chess.setX(5);
		display(chess);
		System.out.println("----------悔棋----------");
		chess.restore(mc.getMemento());
		display(chess);
	}

	public static void display(Chessman man) {
		System.out.println("棋子 " + man.getLabel() + " 当前位置为：第" + man.getX() + "行,第" + man.getY() + "列");
	}
}

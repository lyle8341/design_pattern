package com.lyle.p4.多例模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Multipleton
 * @Description: 多例模式
 * @author: Lyle
 * @date: 2017年2月13日 下午2:11:53
 */
public class Multipleton {

	// 多例数量
	private static final int N = 10;

	private static List<Multipleton> list = new ArrayList<>(N);

	private int no;// 每个对象的序号，标识

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	private Multipleton(int no) {
		this.no = no;
		System.out.println("--create [" + no + "]");
	}

	static {
		for (int i = 0; i < N; i++) {
			list.add(new Multipleton(i));
		}
	}

	public static Multipleton getRandomInstance() {
		int index = (int) (Math.random() * N);
		return list.get(index);
	}
}

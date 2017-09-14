package com.lyle.p11.桥梁模式;

/**
 * @ClassName: XIdeas
 * @Description: 习思想
 * @author: Lyle
 * @date: 2017年9月14日 下午4:48:18
 */
public class XIdeas extends Ideas {

	@Override
	public void propose(String content) {
		System.out.println(content + "-写入了党章");
	}
}

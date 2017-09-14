package com.lyle.p11.桥梁模式;

/**
 * @ClassName: MIdeas
 * @Description: 毛思想
 * @author: Lyle
 * @date: 2017年9月14日 下午4:46:23
 */
public class MIdeas extends Ideas {

	@Override
	public void propose(String content) {
		System.out.println(content + "-写入了党章");
	}
}

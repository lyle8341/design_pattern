package com.lyle.structure.桥梁模式;

/**
 * @ClassName: DIdeas
 * @Description: 邓思想
 * @author: Lyle
 * @date: 2017年9月14日 下午4:47:18
 */
public class DIdeas extends Ideas {

	@Override
	public void propose(String content) {
		System.out.println(content + "-写入了党章");
	}
}

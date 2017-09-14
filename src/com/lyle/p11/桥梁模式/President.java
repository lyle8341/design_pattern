package com.lyle.p11.桥梁模式;

/**
 * @ClassName: President
 * @Description:
 * @author: Lyle
 * @date: 2017年9月14日 下午4:22:09
 */
public abstract class President {

	private Ideas ideas;

	public President(Ideas ideas) {
		this.ideas = ideas;
	}

	public void updateConstitution(String content) {
		ideas.propose(content);
	};
}

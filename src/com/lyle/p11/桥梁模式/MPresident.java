package com.lyle.p11.桥梁模式;

/**
 * @ClassName: MPresident
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年9月14日 下午4:49:33
 */
public class MPresident extends President {

	public MPresident(Ideas ideas) {
		super(ideas);
	}

	@Override
	public void updateConstitution(String content) {
		super.updateConstitution(content);
	}
}

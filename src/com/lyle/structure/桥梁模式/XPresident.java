package com.lyle.structure.桥梁模式;

/**
 * @ClassName: XPresident
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年9月14日 下午4:53:05
 */
public class XPresident extends President {

	public XPresident(Ideas ideas) {
		super(ideas);
	}

	@Override
	public void updateConstitution(String content) {
		super.updateConstitution(content);
	}
}

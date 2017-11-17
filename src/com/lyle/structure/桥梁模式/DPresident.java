package com.lyle.structure.桥梁模式;

/**
 * @ClassName: DPresident
 * @Description:
 * @author: Lyle
 * @date: 2017年9月14日 下午4:52:33
 */
public class DPresident extends President {

	public DPresident(Ideas ideas) {
		super(ideas);
	}

	@Override
	public void updateConstitution(String content) {
		super.updateConstitution(content);
	}
}

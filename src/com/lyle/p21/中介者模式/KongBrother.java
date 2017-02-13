package com.lyle.p21.中介者模式;

/**
 * @ClassName: KongBrother
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:33:07
 */
public class KongBrother extends AbstractColleague {

	@Override
	public void sharePear(float pear, AbstractMediator m) {
		this.pear = pear;
		m.bAffectK();
	}
}

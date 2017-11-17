package com.lyle.behavior.中介者模式;

/**
 * @ClassName: KongRong
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:31:46
 */
public class KongRong extends AbstractColleague {

	@Override
	public void sharePear(float pear, AbstractMediator m) {
		this.pear = pear;
		m.kAffectB();
	}
}

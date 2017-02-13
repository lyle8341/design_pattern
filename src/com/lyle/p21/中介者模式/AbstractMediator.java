package com.lyle.p21.中介者模式;

/**
 * @ClassName: Mediator
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:27:08
 */
public abstract class AbstractMediator {

	protected AbstractColleague kongrong;

	protected AbstractColleague kongbrother;

	public AbstractMediator(AbstractColleague kongrong, AbstractColleague kongbrother) {
		this.kongrong = kongrong;
		this.kongbrother = kongbrother;
	}

	public abstract void kAffectB();

	public abstract void bAffectK();
}

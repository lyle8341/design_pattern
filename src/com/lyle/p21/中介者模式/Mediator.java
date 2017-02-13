package com.lyle.p21.中介者模式;

/**
 * @ClassName: Mediator
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:40:34
 */
public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague kongrong, AbstractColleague kongbrother) {
		super(kongrong, kongbrother);
	}

	@Override
	public void kAffectB() {
		float prear = kongrong.getPear();
		kongbrother.setPear(1 - prear);
	}

	@Override
	public void bAffectK() {
		float pear = kongbrother.getPear();
		kongrong.setPear(1 - pear);
	}
}

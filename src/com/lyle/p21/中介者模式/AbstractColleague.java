package com.lyle.p21.中介者模式;

/**
 * @ClassName: Colleague
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月13日 上午10:29:46
 */
public abstract class AbstractColleague {

	protected float pear;

	public float getPear() {
		return pear;
	}

	public void setPear(float pear) {
		this.pear = pear;
	}

	public abstract void sharePear(float pear, AbstractMediator m);
}

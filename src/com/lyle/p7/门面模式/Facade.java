package com.lyle.p7.门面模式;

/**
 * @ClassName: Facade
 * @Description: facade
 * @author: Lyle
 * @date: 2017年2月3日 下午2:35:08
 */
public class Facade {

	private C110 c110;

	private C120 c120;

	private C119 c119;

	public Facade() {
		this.c110 = new C110();
		this.c119 = new C119();
		this.c120 = new C120();
	}

	public void alarmKill() {
		c110.kill();
	}

	public void alarmHurt() {
		c120.hurt();
	}

	public void alarmFire() {
		c119.fire();
	}
}

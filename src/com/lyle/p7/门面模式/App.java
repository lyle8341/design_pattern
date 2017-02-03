package com.lyle.p7.门面模式;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年2月3日 下午2:40:45
 */
public class App {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.alarmFire();
		facade.alarmHurt();
		facade.alarmKill();
	}
}

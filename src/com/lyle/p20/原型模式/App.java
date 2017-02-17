package com.lyle.p20.原型模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月17日 下午12:04:07
 */
public class App {

	public static void main(String[] args) {
		Lover lover = new RealLover();
		lover.getSexPartner().served();
		System.out.println("-------------------");
		InflatableDolls l1 = lover.getSexPartner();
		l1.setName("林志玲");
		l1.setPrice(542.2);
		l1.served();
		System.out.println("-------------------");
		InflatableDolls l2 = lover.getSexPartner();
		l2.setName("杨幂");
		l2.setPrice(4391);
		l2.served();
	}
}

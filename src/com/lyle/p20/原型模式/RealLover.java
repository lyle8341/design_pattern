package com.lyle.p20.原型模式;

/**
 * @ClassName: RealLover
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月17日 下午1:53:58
 */
public class RealLover implements Lover {

	private static InflatableDolls doll = null;

	@Override
	public InflatableDolls getSexPartner() {
		if (doll == null) {
			doll = new InflatableDolls();
			doll.setName("范冰冰");
			doll.setMaterial("硅胶");
			doll.setPrice(342);
			doll.setSex("女");
			doll.setSize("169cmm");
		} else {
			doll = doll.clone();
		}
		return doll;
	}
}

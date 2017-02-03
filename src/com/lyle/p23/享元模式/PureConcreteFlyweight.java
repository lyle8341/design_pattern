package com.lyle.p23.享元模式;

/**
 * @ClassName: PureConcreteFlyweight
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年1月24日 下午4:15:43
 */
public class PureConcreteFlyweight implements PureFlyweight {

	private Character intrinsic = null;

	public PureConcreteFlyweight(Character state) {
		this.intrinsic = state;
	}

	@Override
	public void execute(String state) {
		System.out.println("Intrinsic state = " + this.intrinsic);
		System.out.println("Extrinsic state = " + state);
	}
}

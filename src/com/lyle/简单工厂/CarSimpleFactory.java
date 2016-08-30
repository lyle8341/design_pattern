package com.lyle.简单工厂;

/**
 * 简单工厂的方法通常是静态的，所以也被称为静态工厂
 * @author Lyle
 *
 */
public class CarSimpleFactory {

	public static final String TOPTYPE = "toptype";
	public static final String MIDTYPE = "midtype";
	public static final String LOWTYPE = "lowtype";
	
	public static ICar create(String mark){
		ICar obj = null;
		if(mark.equals(TOPTYPE)){
			obj = new TopCar();
		}else if(mark.equals(MIDTYPE)){
			obj = new MidCar();
		}else if(mark.equals(LOWTYPE)){
			obj = new LowCar();
		}
		return obj;
	}
}

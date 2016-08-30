package com.lyle.工厂;

import com.lyle.简单工厂.ICar;
import com.lyle.简单工厂.LowCar;

public class LowFactory extends AbstractFactory{

	@Override
	public ICar create() {
		return new LowCar();
	}

}

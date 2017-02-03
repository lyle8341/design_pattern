package com.lyle.p16.观察者模式;

public class App {

	public static void main(String[] args) {
		House h = new House(1000);
		HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
		HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
		HousePriceObserver hpo3 = new HousePriceObserver("购房者C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);// 输出房子价格
		// 修改房子价格，会触发update(Observable o, Object arg)方法通知购房者新的房价信息
		h.setPrice(2222222);//
		System.out.println(h);// 再次输出房子价格
	}
}

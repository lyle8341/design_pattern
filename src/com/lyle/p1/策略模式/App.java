package com.lyle.p1.策略模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月3日 下午3:52:12
 */
public class App {

	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
		MemberStrategy strategy = new AdvanceMemStrategy();
		// 创建环境
		Price price = new Price(strategy);
		// 计算价格
		double quote = price.quote(300);
		System.out.println("图书的最终价格为：" + quote);
	}
}

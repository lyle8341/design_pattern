package com.lyle.p11.桥梁模式;

/**
 * @ClassName: App
 * @Description:
 * @author: Lyle
 * @date: 2017年9月14日 下午4:53:22
 */
public class App {

	public static void main(String[] args) {
		// 毛时代
		Ideas ideas = new MIdeas();
		President president = new MPresident(ideas);
		president.updateConstitution("发动群众，走农村包围城市路线");
		// 邓时代
		ideas = new DIdeas();
		president = new DPresident(ideas);
		president.updateConstitution("黑猫白猫抓住老鼠都是好猫");
		// 习时代
		ideas = new XIdeas();
		president = new XPresident(ideas);
		president.updateConstitution("打虎拍蝇，将改革进行到底");
	}
}

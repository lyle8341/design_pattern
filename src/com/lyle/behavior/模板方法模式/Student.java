package com.lyle.behavior.模板方法模式;

/**
 * @ClassName: Student
 * @Description: 学生
 * @author: Lyle
 * @date: 2017年2月3日 下午1:44:20
 */
public class Student extends Examination {

	@Override
	protected void entranceRoom() {
		System.out.println("学生进入教室");
	}

	@Override
	protected void before() {
		System.out.println("检查笔，橡皮，草稿纸等");
	}

	@Override
	protected void doing() {
		System.out.println("开始答题");
	}

	@Override
	protected void after() {
		System.out.println("交卷，走人");
	}
}

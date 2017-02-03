package com.lyle.p9.模板方法模式;

/**
 * @ClassName: Teacher
 * @Description: 老师
 * @author: Lyle
 * @date: 2017年2月3日 下午1:46:33
 */
public class Teacher extends Examination {

	@Override
	protected void entranceRoom() {
		System.out.println("老师进入考场");
	}

	@Override
	protected void before() {
		System.out.println("检查试卷封条，朗读考场纪律");
	}

	@Override
	protected void doing() {
		System.out.println("四处走动，监考");
	}

	@Override
	protected void after() {
		System.out.println("收集所有试卷，封装带走");
	}
}

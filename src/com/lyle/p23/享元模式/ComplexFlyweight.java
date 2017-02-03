package com.lyle.p23.享元模式;

/**
 * @ClassName: Flyweight
 * @Description: 复合享元模式
 *               <p>
 *               在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。
 *               在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。 String a="abc"，其中"abc"就是一个字符串常量。
 *               </p>
 * @author: Lyle
 * @date: 2017年1月24日 下午3:00:07
 */
public interface ComplexFlyweight {

	public void execute(String state);
}

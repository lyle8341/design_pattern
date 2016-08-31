/**
 * @author Lyle
 * <br><b>Package annotations must be in file package-info.java</b><br> 
 * 1.提供包的整体说明:这个包的作用是xxx<br>
 * 2.声明包的私有类和常量<br>
 * 3.为在包上标注注解提供便利
 */
@MyPackageAnnoation
package com.lyle.package_info;

class MypackageMethod {
	public void method(){
		System.out.println("这是一个包类，仅供本包使用的公共类。");
	}
}

class PkgConstant{
	/**
	 * 这是一个包常量，仅供本包内访问
	 */
	static final String NAME = "lyle";
	
}
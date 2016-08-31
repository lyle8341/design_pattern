package com.lyle.package_info;

import java.lang.annotation.Annotation;
import java.util.List;
public class PkgInfoTest {

	public static void main(String[] args) {
		//==========友好类和包内访问常量============
		new MypackageMethod().method();
		System.out.println(PkgConstant.NAME);
		
		//===========包上注解===========
		//只在本包有效
		Package pkg = Package.getPackage("com.lyle.package_info");
		for(Annotation annotation:pkg.getAnnotations()){
			System.out.println(annotation.annotationType().getName());
		}
		System.out.println("==============");
		//==========在其他包中用===========
		Package pkg2 = PkgInfoTest.class.getPackage();
		System.out.println(pkg2.getName());
		//查出的是bin文件夹里class文件的个数
		List<Class<?>> list = ClassUtils.getClasses(pkg2.getName());
		System.out.println(list.size());
		for(Class<?> c:list){
			System.out.println(c.getName());
		}
	}
}

package com.lyle.test;

import com.lyle.package_info.PkgInfoTest;

public class Test {

	public static void main(String[] args) {
		// ===========包上注解===========
		Package pkg = PkgInfoTest.class.getPackage();
		System.out.println(pkg.getName());
	}
}

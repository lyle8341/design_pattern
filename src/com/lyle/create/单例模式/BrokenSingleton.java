package com.lyle.create.单例模式;

import com.lyle.create.单例模式.懒汉式.SingletonDemo;

import java.lang.reflect.Constructor;

/**
 * 破解单例（枚举式除外）
 *
 * @author lyle 2023-11-20 23:42
 */
public class BrokenSingleton {

    public static void main(String[] args) throws Exception {

        //reflectBroken();

    }

    private static void reflectBroken() throws Exception {
        //反射调用私有构造器
        Class<SingletonDemo> clazz = (Class<SingletonDemo>) Class.forName("com.lyle.create.单例模式.懒汉式.SingletonDemo");
        Constructor<SingletonDemo> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingletonDemo instance1 = constructor.newInstance();
        SingletonDemo instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);
        //解决方法，构造器中加入判断
        /**
         * private SingletonDemo() {
         *         if (null != instance) { //首次需要放行
         *             throw new RuntimeException();
         *         }
         * }
         */
    }


}
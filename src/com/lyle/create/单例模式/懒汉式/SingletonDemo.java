package com.lyle.create.单例模式.懒汉式;

/**
 * 线程安全
 *
 * @author lyle 2023-11-20 23:00
 */
public class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo() {
        if (null != instance) {
            throw new RuntimeException();
        }
    }

    public static synchronized SingletonDemo getInstance() {
        if (null == instance) {
            instance = new SingletonDemo();
        }
        return instance;
    }

}
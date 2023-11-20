package com.lyle.create.单例模式.饿汉式;

/**
 * 线程安全
 * @author lyle 2023-11-20 22:52
 */
public class SingletonDemo {

    private SingletonDemo() {
    }

    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时， 天然的线程安全
    private static SingletonDemo instance = new SingletonDemo();

    public static SingletonDemo getInstance() {
        return instance;
    }
}
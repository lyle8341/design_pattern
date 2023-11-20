package com.lyle.create.单例模式.静态内部类;

/**
 * 外部类没有static属性，则属于懒加载
 * 并发高效，线程安全
 * @author lyle 2023-11-20 23:23
 */
public class SingletonDemo {

    private SingletonDemo() {
    }

    private static class SingletonClassInstance {
        private static final SingletonDemo instance = new SingletonDemo();
    }

    public static SingletonDemo getInstance() {
        return SingletonClassInstance.instance;
    }

}
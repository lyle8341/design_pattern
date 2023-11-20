package com.lyle.create.单例模式.双重检测;

/**
 * @author lyle 2023-11-20 23:05
 */
public class SingletonDemo {

    //volatile 禁止重排
    private volatile static SingletonDemo instance = null;

    public static SingletonDemo getInstance() {
        if (null == instance) {
            synchronized (SingletonDemo.class) {
                if (null == instance) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    private SingletonDemo() {
    }
}
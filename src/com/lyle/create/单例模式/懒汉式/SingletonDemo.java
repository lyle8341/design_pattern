package com.lyle.create.单例模式.懒汉式;

import java.io.Serial;
import java.io.Serializable;

/**
 * 线程安全
 *
 * @author lyle 2023-11-20 23:00
 */
public class SingletonDemo implements Serializable {

    @Serial
    private static final long serialVersionUID = -2757595141363424477L;
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

    /**
     * 反序列化时，如果定义了 readResolve 则直接返回此方法指定的对象
     * 而不需要单独再创建新对象
     */
    private Object readResolve(){
        return instance;
    }
}
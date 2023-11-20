package com.lyle.create.单例模式.枚举;

/**
 * 线程安全
 * 没有懒加载
 * 避免通过反射和反序列化的漏洞
 * @author lyle 2023-11-20 23:30
 */
public enum SingletonDemo {

    //这个枚举元素，本身就是单例对象
    INSTANCE;

    //添加自己需要的操作
    public void operation(){


    }




}
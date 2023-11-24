package com.lyle.create.单例模式;

import com.lyle.create.单例模式.懒汉式.SingletonDemo;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 破解单例（枚举式除外）
 *
 * @author lyle 2023-11-20 23:42
 */
public class BrokenSingleton {

    public static void main(String[] args) throws Exception {

        //reflectBroken();

        serializeBroken();


    }

    private static void serializeBroken() throws IOException, ClassNotFoundException {
        SingletonDemo instance1 = SingletonDemo.getInstance();
        System.out.println("instance1 = " + instance1);
        SingletonDemo instance2 = SingletonDemo.getInstance();
        System.out.println("instance2 = " + instance2);
        //通过反序列化方式创建对象
        FileOutputStream fos = new FileOutputStream("/tmp/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/a.txt"));
        SingletonDemo serialize = (SingletonDemo) ois.readObject();
        System.out.println("serialize = " + serialize);
        /**
         * 反序列化时，如果定义了 readResolve 则直接返回此方法指定的对象
         * 而不需要单独再创建新对象
         *
         * private Object readResolve(){
         *    return instance;
         * }
         */
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
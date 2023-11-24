package com.lyle.create.单例模式;


import java.util.concurrent.CountDownLatch;

/**
 * @author lyle 2023-11-20 23:33
 */
public class Client {

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100_000; j++) {
//                    com.lyle.create.单例模式.懒汉式.SingletonDemo instance = com.lyle.create.单例模式.懒汉式.SingletonDemo.getInstance();
//                    com.lyle.create.单例模式.饿汉式.SingletonDemo instance1 = com.lyle.create.单例模式.饿汉式.SingletonDemo.getInstance();
//                    com.lyle.create.单例模式.双重检测.SingletonDemo instance2 = com.lyle.create.单例模式.双重检测.SingletonDemo.getInstance();
//                    com.lyle.create.单例模式.静态内部类.SingletonDemo instance3 = com.lyle.create.单例模式.静态内部类.SingletonDemo.getInstance();
                    com.lyle.create.单例模式.枚举.SingletonDemo instance4 = com.lyle.create.单例模式.枚举.SingletonDemo.INSTANCE;
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时: " + (end - start));
    }
}
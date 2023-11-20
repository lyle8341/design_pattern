package com.lyle.create.单例模式;

import com.lyle.create.单例模式.枚举.SingletonDemo;

/**
 * @author lyle 2023-11-20 23:33
 */
public class Client {

    public static void main(String[] args) {


        SingletonDemo demo = SingletonDemo.INSTANCE;
        SingletonDemo demo2 = SingletonDemo.INSTANCE;
        System.out.println(demo2 == demo);


    }


}
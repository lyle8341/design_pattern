package com.lyle.create.原型模式;

import java.util.Date;

public class Client {

    public static void main(String[] args) {

        Sheep wd = new Sheep("伍德", new Date());
        System.out.println(wd);

        Sheep clone = wd.clone();
        System.out.println(clone);

    }
}
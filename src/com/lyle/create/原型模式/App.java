/**
 * www.siknut.com
 * Copyright (C) 2012-2017 All Rights Reserved.
 */
package com.lyle.create.原型模式;

import javafx.scene.Parent;

/**
 * @Desc:
 * @Author:Lyle
 * @Date:2017-11-17 16:14
 * @See:<相关类>     
 * @Version:v1.0
 * @JDK:JDK1.8  
 */
public class App {

  public static void main(String[] args)throws Exception {
    Student s1 = new Student();
    s1.setAge(21);
    s1.setName("张三");
    Parents p = new Parents();
    p.setFather("张大锤");
    p.setMother("王晓曼");
    s1.setParents(p);

    //浅克隆
    Student s2 = s1.clone();
//    s2.getParents().setFather("老王");
//    System.out.println(s1);
//    System.out.println(s2);


    //深克隆
    Student s3 = s1.deepClone();
    s3.getParents().setFather("老李");
    System.out.println(s1);
    System.out.println(s3);
  }
}

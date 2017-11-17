/**
 * www.siknut.com Copyright (C) 2012-2017 All Rights Reserved.
 */
package com.lyle.create.原型模式;

import java.io.Serializable;

/**
 * @Desc:家长
 * @Author:Lyle
 * @Date:2017-11-17 15:56
 * @See:<相关类>
 * @Version:v1.0
 * @JDK:JDK1.8
 */
public class Parents implements Serializable{

  private static final long serialVersionUID = 8639604675974066222L;

  private String father;

  private String mother;

  public String getFather() {
    return father;
  }

  public void setFather(String father) {
    this.father = father;
  }

  public String getMother() {
    return mother;
  }

  public void setMother(String mother) {
    this.mother = mother;
  }

  @Override
  public String toString() {
    return "Parents{" +
        "father='" + father + '\'' +
        ", mother='" + mother + '\'' +
        '}';
  }
}

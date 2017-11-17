/**
 * www.siknut.com Copyright (C) 2012-2017 All Rights Reserved.
 */
package com.lyle.create.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Desc:
 * @Author:Lyle
 * @Date:2017-11-17 16:04
 * @See:<相关类>
 * @Version:v1.0
 * @JDK:JDK1.8
 */
public class Student implements Cloneable, Serializable {

  private static final long serialVersionUID = -2002337487706022648L;

  private String name;

  private Integer age;

  private Parents parents;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Parents getParents() {
    return parents;
  }

  public void setParents(Parents parents) {
    this.parents = parents;
  }

  @Override
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }

  public Student deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(baos);
    out.writeObject(this);
    out.flush();
    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
    return (Student) ois.readObject();
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", parents=" + parents +
        '}';
  }
}

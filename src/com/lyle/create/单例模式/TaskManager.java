/**
 * www.siknut.com
 * Copyright (C) 2012-2017 All Rights Reserved.
 */
package com.lyle.create.单例模式;/**
 * @Desc:单例模式
 * @Author:Lyle
 * @Date:2017-11-15 15:21
 * @See:<相关类>     
 * @Version:v1.0
 * @JDK:JDK1.8  
 */
public class TaskManager {
  private TaskManager(){

  }

  private static class TaskFactory{
    private static TaskManager instance = new TaskManager();
  }

  public static TaskManager getInstance(){
    return TaskFactory.instance;
  }

  /**
   * 如果该类被用于序列化，可以保证对象在序列化前后保持一致
   */
  public Object readResolve() {
    return getInstance();
  }
}

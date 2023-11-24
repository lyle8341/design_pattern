package com.lyle.create.原型模式;

import java.util.Date;

/**
 * 原型模式=克隆模式=拷贝模式
 * 需要实现Cloneable接
 */
public class Sheep implements Cloneable {

    private String name;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep(){

    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Sheep clone() {
        try {
            // TODO: copy mutable state here,
            //  so the clone can't change the internals of the
            //  original
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

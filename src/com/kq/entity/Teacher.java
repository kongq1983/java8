package com.kq.entity;

/**
 * Created by qikong on 2019/3/26.
 */
public class Teacher {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}

package com.kq.interfacedemo;

/**
 * Created by qikong on 2019/3/16.
 */
public class MyRunnableDemo {

    public static void main(String[] args) {

        MyRunnable r = () -> System.out.println("run start.");

        r.run();

    }

}

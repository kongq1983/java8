package com.kq.synchronizeddemo;

/**
 * @author kq
 * @date 2021-12-30 16:48
 * @since 2020-0630
 */
public class SynchronizedDemo1 {

    private static String name;

    public synchronized static int add1(int a ,int b) {
        int c = a+b;
        return c;
    }

    public synchronized int add2(int a ,int b) {
        int c = a+b;
        return c;
    }

    public synchronized static void add(int a ,int b) {
        name +="add";
        System.out.println();
    }

    public void sum(int a,int b) {
        synchronized (SynchronizedDemo1.class) {
            System.out.println();
        }
    }

    public synchronized void sub(int a,int b) {
        name +="sub";
        System.out.println();
    }


    public static void main(String[] args) {

    }

}

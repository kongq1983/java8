package com.kq.synchronizeddemo;

/**
 * 2个方法锁消除
 * @author kq
 * @date 2021-12-30 16:48
 * @since 2020-0630
 */
public class SynchronizedDemo {

    public synchronized static void add(int a ,int b) {
        System.out.println();
    }

    public void sum(int a,int b) {
        synchronized (SynchronizedDemo.class) {
            System.out.println();
        }
    }

    public synchronized void sub(int a,int b) {
        System.out.println();
    }


    public static void main(String[] args) {

    }

}

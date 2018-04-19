package com.kq.thread;

public class ThreadTest {

    public static void main(String[] args) {
        Thread t = new Thread(()->
                System.out.println(Thread.currentThread().getName()+" is running.")
        );
        t.start();
    }

}

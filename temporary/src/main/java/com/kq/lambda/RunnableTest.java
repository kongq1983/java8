package com.kq.lambda;

/**
 * @author kq
 * @date 2021-05-17 13:52
 * @since 2020-0630
 */
public class RunnableTest {

    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println(Thread.currentThread().getName()+" is running! ");
        };

        Thread t = new Thread(r);
        t.start();

    }

}

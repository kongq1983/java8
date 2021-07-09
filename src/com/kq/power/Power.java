package com.kq.power;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author kq
 * @date 2021-06-23 8:56
 * @since 2020-0630
 */
public class Power {

    private static final AtomicInteger idx = new AtomicInteger();

    private static boolean isPowerOfTwo(int val) {
        return (val & -val) == val;
    }

    public static void main(String[] args) {
        for(int i=1;i<20;i++) {
            if(isPowerOfTwo(i)){
                System.out.println(i+", is power of two. binary: "+ Integer.toBinaryString(i));
            }



        }

        for(int i=0;i<20;i++) {
            int result = idx.getAndIncrement() & 8 - 1; // 优先级 -  然后 &
            System.out.println("result="+result);
        }


    }
}

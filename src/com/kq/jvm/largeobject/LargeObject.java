package com.kq.jvm.largeobject;

import java.util.concurrent.TimeUnit;

/**
 * LargeObject
 *
 * @author kq
 * @date 2021/7/12 22:13
 * @since 1.0.0
 */
public class LargeObject {

    private static final int _1MB = 1024 * 1024;

    /** -XX:+PrintGCApplicationStoppedTime
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * edin:8m  s0:1m   s1:1m
     */
//    public static void testAllocation() {
//        byte[] allocation1, allocation2, allocation3, allocation4;
//        allocation1 = new byte[2 * _1MB];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];  // 出现一次Minor GC
//    }

    public static void testAllocation1() {
        byte[] allocation1, allocation2
                , allocation3, allocation4,allocation5;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
//        allocation5 = new byte[1 * _1MB];
//        allocation4 = new byte[4 * _1MB];  // 出现一次Minor GC
    }


    public static void main(String[] args) throws Exception{
//        testAllocation();
        testAllocation1();
        while (true) {
            TimeUnit.MINUTES.sleep(10);
//            TimeUnit.SECONDS.sleep(2);
        }
    }


}

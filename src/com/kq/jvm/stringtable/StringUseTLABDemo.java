package com.kq.jvm.stringtable;

import java.util.ArrayList;

/**
 * // 参数：-XX:+UseTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
 * @author kq
 * @date 2021-11-03 11:16
 * @since 2020-0630
 */
public class StringUseTLABDemo {

    public static void alloc() {
        byte[] b = new byte[2];
    }

    public static void main(String[] args) {
        // TLAB分配
        // 参数：-XX:+UseTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main1(String[] args) {
        System.out.println();
    }


}

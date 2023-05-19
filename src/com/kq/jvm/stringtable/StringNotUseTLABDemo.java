package com.kq.jvm.stringtable;

/**
 * @author kq
 * @date 2021-11-03 11:19
 * @since 2020-0630
 */
public class StringNotUseTLABDemo {

    public static void main(String[] args) {
        // TLAB分配
        // 参数：-XX:+UseTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        int num = 1;

        int b = (num << 5);
        System.out.println(b);

    }

    public static void alloc() {
        byte[] b = new byte[2];
    }


}

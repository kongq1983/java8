package com.kq.map;

/**
 * @author kq
 * @date 2020-07-07 13:42
 * @since 2020-0630
 */
public class MyDebugConstant {

    public static final int NUM = 0x80000001;
//    public static final int NUM = 80000001;

    public static void main(String[] args) {
        System.out.println(NUM);
        System.out.println(Integer.toBinaryString(NUM));
    }

}

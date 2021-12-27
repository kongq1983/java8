package com.kq.hashmap;

import java.util.HashMap;

/**
 * HashMapDemo
 *
 * @author kq
 * @date 2021/8/27 21:52
 * @since 1.0.0
 */
public class HashMapDemo {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
//        int num = 7;
        int num = 8;

        int result = tableSizeFor(num);

//        int a = 5; // 0000 0101
//        int b = 3; // 0000 0011
//        a |= b; // 0000 00111

        System.out.println("result="+result);

    }
    // 1000  0111  011 01 0
    // 0011  0001
    // 0110
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
//        System.out.println(n>>>1);
//        System.out.println(n>>>2);
//        System.out.println(n>>>4);
//        System.out.println(n>>>8);
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

}

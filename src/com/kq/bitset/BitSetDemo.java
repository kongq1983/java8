package com.kq.bitset;

import java.util.BitSet;

/**
 * BitSetDemo
 * 这个是java bitset demo
 * @author kq
 * @date 2019-04-08
 */
public class BitSetDemo {

    public static void main(String[] args) {
//        BitSet bm=new BitSet(1);
//        System.out.println(bm.isEmpty()+"--"+bm.size());
//        bm.set(0);
//        System.out.println(bm.isEmpty()+"--"+bm.size());
//        bm.set(1);
//        System.out.println(bm.isEmpty()+"--"+bm.size());
//        System.out.println(bm.get(65));
//        System.out.println(bm.isEmpty()+"--"+bm.size());
//        bm.set(65);
//        System.out.println(bm.isEmpty()+"--"+bm.size());
//        bm.set(300);


//        String one = Integer.toHexString(200);
//        System.out.println(one);

//        byte b = (byte)255;
//
//        for(int i=0;i<=255;i++){
//            System.out.println((byte(i)));
//        }
//
//
//        for(byte i=0;i<b;i++) {
//            System.out.println(i);
//            System.out.println((char)i);
//        }

        byte bt = 78;
        char c = (char)bt;

//        for(byte i=0;i<255;i++){
//            System.out.println(i);
//        }

//        for(int i=0;i<255;i++){
        for(int i=0;i<15;i++){
            byte b = (byte)i;
            System.out.println((char)b);
        }


        System.out.println("----------------------");
    }

}

package com.kq.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSetDemo
 *
 * @author kq
 * @date 2019-12-17
 */
public class HashSetDemo {

    public static void main(String[] args) {
        String[] array1 = {"AB","AC","AD","BC","BD","CD"};
        String[] array2 = {"CD","AB","AD","BC","BD","AC"};
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        for(String s: array1) {
            set.add(s);
        }

        for(String s: array2) {
            set1.add(s);
        }

        for(String s : set) {
            System.out.println("s="+s);
        }
        System.out.println("------------------------------");
        for(String s : set1) {
            System.out.println("s1="+s);
        }
    }

}

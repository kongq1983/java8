package com.kq.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * MyFlatMapDemo
 *
 * @author kq
 * @date 2019-12-04
 */
public class MyFlatMapDemo {

    public static void main(String[] args) {

        String[] array1 = {"one","two"};
        String[] array2 = {"two","three","five"};

        List<Object> list = Stream.of(array1,array2).collect(Collectors.toList());

        for(Object o  : list) {
            System.out.println(o);
        }

        System.out.println("---------------------------------------");

        List<Object> list1 = Stream.of(array1,array2).flatMap(Arrays::stream).collect(Collectors.toList());

        for(Object o  : list1) {
            System.out.println(o);
        }

        System.out.println("---------------------------------------");

        List<Object> list2 = Stream.of(array1,array2).flatMap(Stream::of).collect(Collectors.toList());

        for(Object o  : list2) {
            System.out.println(o);
        }


    }

}

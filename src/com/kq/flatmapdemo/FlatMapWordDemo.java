package com.kq.flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by qikong on 2019/3/18.
 */
public class FlatMapWordDemo {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("one","two","three");

        List<String> list = words.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        list.forEach(System.out::println);


        StringBuilder str = new StringBuilder(32);
        str.append("1");

        for(int i=0;i<31;i++) {
            str.append("0");
        }

        System.out.println(str);
        System.out.println(str.length());


    }


}

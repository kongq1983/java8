package com.kq.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class NumberStream {

    public static void main(String[] args) {

        List<Integer> list = IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
        System.out.println(list);


    }

}

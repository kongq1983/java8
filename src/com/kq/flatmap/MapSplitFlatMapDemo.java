package com.kq.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * MapSplitFlatMapDemo
 *
 * @author kq
 * @date 2019-12-04
 */
public class MapSplitFlatMapDemo {

    public static void main(String[] args) {

        String[] strings = {"1,2,3","5,6,7","8,9,0"};
        // 1. 先数组中的3个对象，合并成1个流
        // 2. 把每个元素根据,分隔
        // 3. 逗号分隔后的数组，然后再合并成一个流
        List<String> list = Stream.of(strings).flatMap(Stream::of).map(s->s.split(",")).flatMap(Stream::of).collect(Collectors.toList());
        System.out.println(list);


        String string = "1,2,3,4,5,6,7,8,9";
        list = Stream.of(string).map(s-> s.split(",")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(list);


    }

}

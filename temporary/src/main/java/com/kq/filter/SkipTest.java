package com.kq.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kq
 * @date 2021-04-19 17:01
 * @since 2020-0630
 */
public class SkipTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        // 从第4个之后开始
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));


    }

}

package com.kq.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DistinceDemo
 *
 * @author kq
 * @date 2019-11-28
 */
public class DistinceDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("1");
        list.add("3");


        List<String> pointIdList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(pointIdList);

    }

}

package com.kq.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ListSort
 *
 * @author kq
 * @date 2019-12-20
 */
public class ListSort {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("bba");
        list.add("dba");
        list.add("aba");
        list.add("fba");
        list.add("cba");


        List<String> list1 = new ArrayList<>();
        list1.add("cba");
        list1.add("aba");
        list1.add("fba");
        list1.add("dba");
        list1.add("bba");

        list = list.stream().sorted().collect(Collectors.toList());
        list1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println("=====================================");
        System.out.println(list1);

    }

}

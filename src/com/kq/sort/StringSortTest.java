package com.kq.sort;

import java.util.Arrays;
import java.util.List;

public class StringSortTest {

    public static void main(String[] args) {
        String[] strs = {"f","b","a","A","B"};

        List<String>  list = Arrays.asList(strs);
        System.out.println(list);
        list.sort((s1,s2)-> s1.compareToIgnoreCase(s2));
        System.out.println(list);

        System.out.println("--------------------------------------");

        strs = new  String[]{"f","b","a","A","B"};
        list = Arrays.asList(strs);
        System.out.println(list);
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);

    }

}

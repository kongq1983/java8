package com.kq.sort;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ListAdd {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5);
//        list.set(5,"5");
//        list.add(5,"5");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Deque<String> deque = new LinkedList<>();
        deque.add("6");
        deque.add("7");
        deque.add("8");

        deque.addAll(list);


        for(String str : deque) {
            System.out.println(str);
        }

    }

}

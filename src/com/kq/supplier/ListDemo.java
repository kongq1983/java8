package com.kq.supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * ListDemo
 *
 * @author kq
 * @date 2019-12-06
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);

        for(int i=0;i<2;i++) {
            list.add(null);
        }

        System.out.println("size="+list.size());
        for(int i=0;i<list.size();i++){

        }

        list.add(2-1,"two");

        System.out.println(list);

    }

}

package com.kq.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qikong on 2019/3/18.
 */
public class NumberData {


    public static List<Integer> getIntegerLists(int end) {

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<=end;i++) {
            list.add(i);
        }

        return list;

    }



}

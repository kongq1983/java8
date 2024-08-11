package com.kq.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kq
 * @date 2020-07-15 10:35
 * @since 2020-0630
 */
public class ConcurrentHashMapDemo {


    public static void main(String[] args) {
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap();
        String[] arrays = {"hello","good","kong","java","python","oracle","go","c++","groovy"};

        for(String i : arrays) {
            map.put(i,i);
        }

        System.out.println("map:"+map);

    }


}

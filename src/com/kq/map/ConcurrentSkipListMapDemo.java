package com.kq.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author kq
 * @date 2020-07-06 14:35
 * @since 2020-0630
 */
public class ConcurrentSkipListMapDemo {

    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,Integer> map = new ConcurrentSkipListMap();
//        map.put("one","1");
//        map.put("two","2");
//        map.put("three","3");
//        map.put("four","4");
//        map.put("five","5");

        Random r = new Random();

//        int[] arrays = {15,5,2,8,1,9,3,7,4,6,11};
        List<Integer> values = new ArrayList<>();

        int number = 100;
//        int number = arrays.length;
        for(Integer i=0;i<number;i++) {
//            map.put(i,i);
//            Integer newNum = r.nextInt(number*5);
            Integer newNum = r.nextInt(number*1);
            values.add(newNum);
//            Integer newNum = arrays[i];
            map.put(newNum,i);
        }



        String format = "key=%s,val=%s \n";

        Integer val = map.get(10000);
        System.out.printf(format,0,val);

        for(Integer i : values) {
            val = map.get(i);
            System.out.printf(format,i,val);
        }


        for(Map.Entry<Integer,Integer> kv : map.entrySet()) {
            System.out.printf(format,kv.getKey(),kv.getValue());
        }



    }

}

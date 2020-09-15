package com.kq.map;

import java.util.*;

/**
 * @author kq
 * @date 2020-07-13 8:56
 * @since 2020-0630
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap();
//        map.put("one","1");
//        map.put("two","2");
//        map.put("three","3");
//        map.put("four","4");
//        map.put("five","5");

        Random r = new Random();

//        int[] arrays = {15,5,2,8,1,9,3,7,4,6,11};
        List<Integer> values = new ArrayList<>();

        int[] vals = {10,3,50,19,1,22,15,60,7,16,8,25,18,11};
        int number = vals.length;
//        int number = 100;
//        int number = arrays.length;
        for(Integer i=0;i<number;i++) {
//            map.put(i,i);
//            Integer newNum = r.nextInt(number*5);
//            Integer newNum = r.nextInt(number*1);
            Integer newNum = vals[i];
//            values.add(newNum);
//            Integer newNum = arrays[i];
//            System.out.println("index="+i+" value="+newNum);
            map.put(newNum,i);
        }

        System.out.println("=========================================");

        String format = "key=%s,val=%s \n";

        Integer val = map.get(10000);
        System.out.printf(format,0,val);

        for(Integer i : values) {
            val = map.get(i);
            System.out.printf(format,i,val);
        }

        System.out.println("=========================================");

        for(Map.Entry<Integer,Integer> kv : map.entrySet()) {
            System.out.printf(format,kv.getKey(),kv.getValue());
        }
    }

}

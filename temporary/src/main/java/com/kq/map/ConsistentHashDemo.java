package com.kq.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author kq
 * @date 2021-10-26 15:32
 * @since 2020-0630
 */
public class ConsistentHashDemo {

    private final static SortedMap<Long,Long> ring = new TreeMap<Long, Long>();

    static {
        ring.put(1L,1L);
        ring.put(15L,5L);
        ring.put(6L,6L);
        ring.put(3L,3L);
        ring.put(20L,20L);
        ring.put(18L,18L);
        ring.put(50L,50L);
        ring.put(25L,25L);
    }


    public static void main(String[] args) {

        SortedMap<Long,Long> map = ring.tailMap(18L); // 包括18
        Long firstKey = map.firstKey();
        System.out.println("map="+map);
        System.out.println("firstKey="+firstKey);


    }

}

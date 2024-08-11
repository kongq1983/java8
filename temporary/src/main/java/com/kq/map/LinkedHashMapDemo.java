package com.kq.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author kq
 * @date 2022-03-16 8:39
 * @since 2020-0630
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap();

        map.put("two",2); // newNode
        map.put("boy",3);
        map.put("age",1);
        map.put("two",5);

//        for(Map.Entry<String,Integer> kv : map.keySet()) {
        for(String key  : map.keySet()) {
            System.out.println(key);
        }

    }

//    static class Entry<K,V> extends HashMap.Node<K,V> {
//        LinkedHashMap.Entry<K,V> before, after;
//        Entry(int hash, K key, V value, HashMap.Node<K,V> next) {
//            super(hash, key, value, next);
//        }
//    }

//    HashMap.Node<K,V> newNode(int hash, K key, V value, HashMap.Node<K,V> e) {
//        LinkedHashMap.Entry<K,V> p =
//                new LinkedHashMap.Entry<K,V>(hash, key, value, e);
//        linkNodeLast(p);
//        return p;
//    }

}

package com.kq.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * map 函数式用法
 * @author kq
 * @date 2020-10-26 13:48
 * @since 2020-0630
 */
public class MapDemo1 {

    private final static Map<String, Collection<String>> listValueMap = new HashMap<>();
    private final static Map<String, AtomicInteger> wordCountMap = new HashMap<>();
    private final static Map<String, Integer> wordCountIntegerMap = new HashMap<>();
    private final static Map<String, Integer> computeIfPresentMap = new HashMap<>();

    private static void addValue(final String key, final String val) {
        listValueMap.computeIfAbsent(key, k -> new LinkedHashSet<>()).add(val);
    }

    private static void addComputeValue(final String key, final String val) {

        wordCountIntegerMap.compute(key,(k,v)->{
            Integer temp;
            if(v==null){
                temp = 0;
            }else {
                temp = v;
            }
            return temp++;
        });

    }

    public static void main(String[] args) {

        String key = "user";
        addValue(key,"user1");
        addValue(key,"user1");
        System.out.println(listValueMap);
        addValue(key,"user2");
        System.out.println(listValueMap);

        key = "account";
        addValue(key,"account1");
        System.out.println(listValueMap);
        addValue(key,"account2");
        System.out.println(listValueMap);
        //one:1 two:2 three:3
        String[] keys = {"one","two","three","three","two","three"};

        for(String str : keys) {
            wordCountMap.computeIfAbsent(str,k-> new AtomicInteger(0)).incrementAndGet();
        }

        for(Map.Entry<String,AtomicInteger> kv : wordCountMap.entrySet()) {
            System.out.println("key="+kv.getKey()+", value="+kv.getValue().get());
        }

        for(String str : keys) {
            wordCountIntegerMap.compute(str,(k,v)->{
                Integer temp;
                if(v==null){
                    temp = 0;
                }else {
                    temp = v;
                }
                return ++temp;
            });
        }
        System.out.println("==================================================");

        for(Map.Entry<String,Integer> kv : wordCountIntegerMap.entrySet()) {
            System.out.println("key="+kv.getKey()+", value="+kv.getValue());
        }

        // 先放入map
        computeIfPresentMap.put("three",1);
        for(String str : keys) {
            computeIfPresentMap.computeIfPresent(str,(k,v)-> v+1);
        }
        System.out.println("---------------------------------------------");
        for(Map.Entry<String,Integer> kv : computeIfPresentMap.entrySet()) {
            System.out.println("key="+kv.getKey()+", value="+kv.getValue());
        }
    }

}

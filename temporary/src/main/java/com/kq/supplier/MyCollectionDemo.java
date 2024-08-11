package com.kq.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * MyCollectionDemo
 *
 * @author kq
 * @date 2019-12-05
 */
public class MyCollectionDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "C++","php","java");

        System.out.println("list="+list.getClass());

        //用CopyOnWriteArrayList收集
        List<String> copyOnWriteArrayListResult = list.stream().collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        copyOnWriteArrayListResult.forEach(System.out::println);
        System.out.println("--------------");

        if(copyOnWriteArrayListResult instanceof CopyOnWriteArrayList ){
            System.out.println("copyOnWriteArrayListResult instanceof CopyOnWriteArrayList");
        }

    }

}

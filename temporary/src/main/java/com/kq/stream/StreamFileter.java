package com.kq.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by qikong on 2019/3/27.
 */
public class StreamFileter {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,3,6,8,3,8,6,1);

        //取偶数
        List<Integer> oddList = list.stream().filter(i-> i%2==0).collect(Collectors.toList());

        System.out.println("oddList="+oddList);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("distinctList="+distinctList);

        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("set="+set);

        //跳过5个元素
        List<Integer> skip5 = list.stream().skip(5).collect(Collectors.toList());

        System.out.println("skip5="+skip5);

        //取前5个
        List<Integer> limit5 = list.stream().limit(5).collect(Collectors.toList());

        System.out.println("limit5="+limit5);

    }


}

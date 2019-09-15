package com.kq.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class NumericStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10});


        Integer result = stream.filter(n->n%2==0).reduce(0,Integer::sum);
        System.out.println(result);

        stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10});

        IntStream intStream = stream.mapToInt(i-> i.intValue());

        int sum = intStream.filter(i-> i%2==0).sum();
        System.out.println(sum);


    }

}

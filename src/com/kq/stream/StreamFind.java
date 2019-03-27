package com.kq.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class StreamFind {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10});


        Optional<Integer> optional = stream.filter(i-> i%2==0).findAny();
        System.out.println(optional.get());


        stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10});

        Optional<Integer> optional1 = stream.filter(i-> i%2==0).findFirst();
        System.out.println(optional1.get());

        stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10,18});
        Optional<Integer> optional3 = stream.filter(i-> i>10).findAny();

        optional3.ifPresent(n-> System.out.println(n));

        optional3.ifPresent(n-> {
            System.out.println(n);
        });




        int result = find(new Integer[]{1,2,3,4,500,6,7},-1,i-> i>100);
        System.out.println("result="+result);
    }


    private static int find(Integer[] values, int defaultValue, Predicate<Integer> predicate) {

        for(int i : values) {
            if(predicate.test(i))
                return i;
        }

        return  defaultValue;

    }

}

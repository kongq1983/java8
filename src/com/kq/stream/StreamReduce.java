package com.kq.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class StreamReduce {

    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.stream(new Integer[]{1,2,3,4,5});

        Integer result = stream.reduce(0,(i,j)->i+j);
        System.out.println("result="+result);

        stream = Arrays.stream(new Integer[]{1,2,3,4,5});

        stream.reduce((i,j)-> i+j).ifPresent(System.out::println);


        stream = Arrays.stream(new Integer[]{1,2,3,4,5});

        Optional<Integer> optional = stream.reduce((i, j) -> {
            return i>j?i:j;
        });

        System.out.println(optional.get());

        stream = Arrays.stream(new Integer[]{1,2,3,4,5});

        stream.reduce(Integer::max).ifPresent(System.out::println);

        stream = Arrays.stream(new Integer[]{1,2,3,4,5});
        stream.reduce(Integer::min).ifPresent(System.out::println);

    }

}

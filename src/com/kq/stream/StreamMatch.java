package com.kq.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class StreamMatch {


    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,6,10});

        //allMatch
        boolean matched = stream.allMatch(i-> i>0);

        System.out.println(matched);

        stream = Arrays.stream(new Integer[]{1,-1});

        //anyMatch
        matched = stream.anyMatch(i-> i>0);
        System.out.println(matched);

        // noneMatch
        stream = Arrays.stream(new Integer[]{1,8});
        matched = stream.noneMatch(i-> i<0);
        System.out.println(matched);


    }

}

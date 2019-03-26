package com.kq.stream;

import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/26.
 */
public class CreateStream {

    public static void main(String[] args) {
        Stream<Integer> stream = createStreamFromIterator();
        stream.forEach(System.out::println);

        System.out.println("--------------------------");

        createStreamFromGenerate().forEach(System.out::println);
    }


    private static Stream<Integer> createStreamFromIterator(){

        Stream<Integer> stream = Stream.iterate(0,n-> n+2).limit(20);
        return stream;

    }


    private static Stream<Double> createStreamFromGenerate(){

        return Stream.generate(Math::random).limit(100);

    }

}

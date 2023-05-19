package com.kq.function;

import java.util.function.Function;

/**
 * @author kq
 * @date 2022-11-04 10:59
 * @since 2020-0630
 */
public class FunctionDemo {

    public static void main(String[] args) {

//        Function<Integer, Integer> add = s -> s++;
        Function<Integer, Integer> add = s -> s+=2;
        Function<Integer, Integer> multiplication = s -> s * s;


        /**
         * 先执行乘法的apply  Integer multi = 1*1 = 1;
         * 然后乘法的结果集再执行add的apply  Integer add = 1+2 = 3;
         */
        System.out.println(add.compose(multiplication).apply(1)); // 3

        /**
            先执行add的apply  Integer add = (1+2) = 3;
            add的apply当作结果集，执行乘法的apply   Integer multi = 3*3 = 9;
         */
        System.out.println(add.andThen(multiplication).apply(1)); // 9

        /**
         * identity方法会返回一个不进行任何处理的Function，即输出与输入值相等；
         */
        System.out.println(Function.identity().apply("hello"));



    }

}

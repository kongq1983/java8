package com.kq.functiondemo;

import java.util.function.Function;

/**
 * Created by qikong on 2019/3/16.
 */
public class FunctionDemo {


    public static void main(String[] args) {


        // demo1
        String str = "a.jpg";
        Function<String,Boolean> fun = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String suffix) {
                return str.endsWith(suffix);
            }
        };

        Boolean b = fun.apply("jpg");
        System.out.println("endwith jpg="+b);

        Boolean b1 = fun.apply("png");
        System.out.println("endwith png="+b1);


        // demo2
        Function<String,Boolean> fun1 = suffix -> str.endsWith(suffix);
        Boolean b2 = fun1.apply("jpg");
        System.out.println("b2 endwith jpg="+b2);


        //demo3
        Function<String,Boolean> fun2 = str::endsWith;
        Boolean b3 = fun2.apply("jpg");
        System.out.println("b3= endwith jpg="+b3);

    }

}

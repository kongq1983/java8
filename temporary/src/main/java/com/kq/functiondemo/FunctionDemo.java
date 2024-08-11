package com.kq.functiondemo;

import com.kq.entity.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

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

        IntFunction<Double> d = i-> i * 2.5d;
        Double dresult = d.apply(3);
        System.out.println("dresult="+dresult);

        Person person = testBiFunction("King",28,(n,a)-> {
            Person p = new Person(n,a);
            return p;
        });

        System.out.println("person="+person);


    }

    private  static Person testBiFunction(String name, int age, BiFunction<String,Integer,Person> personBiFunction){
        return personBiFunction.apply(name,age);
    }

}

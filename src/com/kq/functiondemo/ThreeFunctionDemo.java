package com.kq.functiondemo;

import com.kq.entity.Person;

/**
 * Created by qikong on 2019/3/26.
 */
public class ThreeFunctionDemo {


    public static void main(String[] args) {

        ThreeFunction<String,String,Integer,Person> threeFunction = Person::new;

        Person p = threeFunction.apply("king","kong",28);

        System.out.println("p="+p);


    }

}

package com.kq.supplier;

import com.kq.entity.Person;

import java.util.function.Supplier;

/**
 * Created by qikong on 2019/3/25.
 */
public class SupplierDemo {


    public static void main(String[] args) {
        Supplier<String> s = String::new;
        System.out.println("class="+s.get().getClass());


        Person p = careatePerson(()-> new Person("king","18"));
        System.out.println("p="+p);

    }


    private static Person careatePerson(Supplier<Person> supplier) {
        return supplier.get();
    }


}

package com.kq.constructiondemo;

import com.kq.entity.Person;

/**
 * Created by qikong on 2019/3/16.
 */
public class PersonFactoryTest {


    public static void main(String[] args) {

        //demo1
        PersonFactory factory = new PersonFactory() {
            @Override
            public Person createPerson(String firstName, String lastName) {
                return new Person(firstName,lastName);
            }
        };

        Person person = factory.createPerson("xiao","kong");
        System.out.println(person);


        //demo2
        PersonFactory factory1 = (firstName,lastName) -> new Person(firstName,lastName);
        System.out.println(factory1.createPerson("xiao","wang"));

        //demo3
        PersonFactory factory2 = Person::new;
        System.out.println(factory2.createPerson("xiao","zhang"));





    }



}

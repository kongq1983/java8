package com.kq.constructiondemo;

import com.kq.entity.Person;

/**
 * Created by qikong on 2019/3/16.
 */
public interface PersonFactory {

    Person createPerson(String firstName,String lastName);


}

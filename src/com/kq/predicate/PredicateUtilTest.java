package com.kq.predicate;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;

/**
 * Created by qikong on 2019/3/17.
 */
public class PredicateUtilTest {


    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();

        PredicateUtil.filter(list,(Student s)-> s.getAge()%2==0);

    }

}

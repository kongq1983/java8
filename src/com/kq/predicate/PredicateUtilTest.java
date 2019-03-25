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

        System.out.println("list"+list);

        PredicateUtil.filter(list,(Student s)-> s.getAge()%2==0);

        List<Student> list1 = PredicateUtil.getStudentList(list,20);
        System.out.println("list1="+list1);


    }

}

package com.kq.sort;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.Comparator;
import java.util.List;

/**
 * SortDemo
 * 排序例子
 * @author kq
 * @date 2019/3/17
 */
public class StringSortDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        System.out.println(list);

        //demo1
        list.sort((Student s1,Student s2) -> (s1.getName().compareTo(s2.getName())));
        list.forEach(System.out::println);

        list = StudentData.getStudentList();
        System.out.println(list);

        //demo2
        list.sort((s1,s2)-> (s1.getName().compareTo(s2.getName())));
        list.forEach(System.out::println);

        list = StudentData.getStudentList();
        System.out.println(list);
        //demo3
        list.sort(Comparator.comparing((s) -> s.getName()));
        list.forEach(System.out::println);

        list = StudentData.getStudentList();
        System.out.println(list);
        //demo4
        list.sort(Comparator.comparing(Student::getName));
        list.forEach(System.out::println);

    }

}

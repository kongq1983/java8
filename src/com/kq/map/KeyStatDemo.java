package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: kq
 * @date: 2023-09-26 14:23:17
 * @since: 1.0.0
 * @description:
 */
public class KeyStatDemo {


    public static void main(String[] args) {
//        test();
        test1();
    }


    /**
     * key: key value:该key的数量
     */
    private static void test(){
        List<Student> list =  StudentData.getStudentListDuplicate();

        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        System.out.println(map);


    }


    private static void test1(){
        List<Student> list =  StudentData.getStudentListDuplicate();

        List<String> repeatList = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(repeatList);


    }


}

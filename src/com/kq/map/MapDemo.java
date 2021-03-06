package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * map demo
 *
 * @author kq
 * @date 2019-03-18
 */
public class MapDemo {

    public static void main(String[] args) {

        List<Student> list = StudentData.getStudentList();

        // 取student的name 变为list
        List<String> nameList = list.stream().map(s->s.getName()).collect(Collectors.toList());

        //排序
        nameList.sort(Comparator.comparing(s-> s));

        nameList.forEach(System.out::println);


       Map<String,Integer> map = list.stream().collect(Collectors.toMap(s-> s.getId()+s.getName(),Student::getAge));


       System.out.println("map="+map);


    }

}

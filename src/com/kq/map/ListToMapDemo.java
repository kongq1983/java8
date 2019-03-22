package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * ListToMapDemo
 *
 * @author kq
 * @date 2019-03-18
 */
public class ListToMapDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();

        //根据名称分组
        Map<String,List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));

        map.forEach((k,v) ->{
            System.out.println("key="+k+" v="+v);
            //取最大值
            Optional<Student> maxStudnet = v.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getId)));
            System.out.println("maxStudnet:"+maxStudnet);

        });



        System.out.println(map);

//        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
//        Map<String,Student> map = list.stream().collect(Collectors.groupingBy(Student::getName)
//                d -> d.collect(Collectors.minBy(Comparator.comparing(Student::getAge))));

//        System.out.println(map);

//        accounts.stream().collect(Collectors.toMap(Account::getId, Account::getUsername));

//        Map<String,Student> map = list.stream().c

    }

}

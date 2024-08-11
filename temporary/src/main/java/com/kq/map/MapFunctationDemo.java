package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kq
 * @date 2020-10-26 15:36
 * @since 2020-0630
 */
public class MapFunctationDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentListDuplicate();
        System.out.println(list);
        Set<String> nameSets = list.stream().map(Student::getName).collect(Collectors.toSet());
        System.out.println(nameSets);
        System.out.println("=====================================");

        List<Student> list1 = StudentData.getStudentList1();
        System.out.println(list1);

        OptionalDouble average = list1.stream().mapToInt(Student::getAge).average();
        average.ifPresent(System.out::println);
        System.out.println(average);

        OptionalInt optionalInt = list1.stream().mapToInt(Student::getAge).max();
        optionalInt.ifPresent(System.out::println);

        String str1 = "one two three";
        String str2 = "one two three four five";

//        List<String> names = Arrays.stream(new String[]{str1,str2}).map(s->s.split(" ")).distinct().collect(Collectors.toList());

//        List stringList = Arrays.asList(strings).stream().
//        map(str -> str.split("")).
//        flatMap(str -> Arrays.stream(str))
//        .collect(Collectors.toList());




    }

}

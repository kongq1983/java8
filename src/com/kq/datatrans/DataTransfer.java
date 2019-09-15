package com.kq.datatrans;

import com.kq.data.StudentData;
import com.kq.entity.Person;
import com.kq.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * DataTransfer
 *
 * @author kq
 * @date 2019-03-21
 */
public class DataTransfer {


    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();

        List<Person> personList = list.stream().map(s-> new Person(s.getName(),s.getAge())).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(personList);

    }


}

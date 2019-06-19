package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;
import com.kq.entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

/**
 * EntiryTransDemo
 * 对象转化
 * @author kq
 * @date 2019-06-19
 */
public class EntiryTransDemo {

    public static void main(String[] args) {

        List<Student> list = StudentData.getStudentList();

        System.out.println(list);

        List<Teacher> teachers = list.stream().map(s->{
            Teacher t = new Teacher();
            t.setId(String.valueOf(s.getId()));
            t.setName(s.getName());

            return t;

        }).collect(Collectors.toList());

        System.out.println(teachers);

    }

}

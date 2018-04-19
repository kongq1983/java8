package com.kq.filter;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class FileterTest {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();

        List<Student> fileterList = list.stream().filter(s->s.getAge()>20).collect(Collectors.toList());

        System.out.println(fileterList);

    }

}

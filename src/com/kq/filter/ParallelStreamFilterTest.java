package com.kq.filter;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 并行测试*
 */
public class ParallelStreamFilterTest {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();

        List<Student> fileterList = list.parallelStream().filter(s->s.getAge()>20).collect(Collectors.toList());

        System.out.println(fileterList);

    }

}

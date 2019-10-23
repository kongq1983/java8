package com.kq.optional;

import com.kq.entity.Student;
import com.kq.entity.Teacher;

import java.util.Optional;

/**
 * OptionalDemo1
 *
 * @author kq
 * @date 2019-09-19
 */
public class OptionalDemo1 {

    public static void main(String[] args) {

        Student student = null;

//        Optional<Student>.ofNullable(student)
        String name = Optional.ofNullable(student).map(Student::getTeacher).map(Teacher::getName).orElse("unKnown");
        System.out.printf("name=%s \n",name);

    }

}

package com.kq.stream;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.stream.Stream;

/**
 * StreamDemo
 *
 * @author kq
 * @date 2019-03-18
 */
public class StreamDemo {

    public static void main(String[] args) {

        Student stu1 = StudentData.getStudent(18);
        Student stu2 = StudentData.getStudent(19);
        Student stu3 = StudentData.getStudent(20);


        Stream newStream = Stream.of(stu1,stu2,stu3);



//        newStream.map(Student::getName);
//        newStream.map((Student s) -> s.getName());



    }

}

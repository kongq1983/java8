package com.kq.data;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentData {

    public static List<Student> getStudentList(){
        int[] ages= {18,16,22,17,18,20,30,15,28};


        Random r = new Random();
        List<Student> list = new ArrayList();
        for(int age : ages) {
            Student stu = new Student();
            stu.setId(r.nextInt(100));
            ((Student) stu).setAge(age);
            ((Student) stu).setName("king"+age);
            list.add(stu);
        }

        return list;
    }


    public static Student getStudent(int age) {
        Student stu = new Student();
        stu.setAge(age);
        stu.setName("king"+age);

        return stu;
    }

}
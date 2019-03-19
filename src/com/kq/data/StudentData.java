package com.kq.data;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

    public static List<Student> getStudentList(){
        int[] ages= {18,16,22,17,20,30,15,28};


        List<Student> list = new ArrayList();
        for(int age : ages) {
            Student stu = new Student();
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
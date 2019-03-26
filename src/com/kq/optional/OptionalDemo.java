package com.kq.optional;

import com.kq.entity.Student;
import com.kq.entity.Teacher;

import java.util.Optional;

/**
 * Created by qikong on 2019/3/26.
 */
public class OptionalDemo {


    public static void main(String[] args) {

//        nullpointer();

        optionalGetStudentName();
        optionalGetTeacherName();
    }


    public static void nullpointer(){

        Student stu = new Student();

//        String name = stu.getTeacher().getName();
//        System.out.println("name="+name);

    }

    public static void optionalGetStudentName(){

//        Student stu = new Student();
        Student stu = null;

        String stuName = Optional.ofNullable(stu).map(Student::getName).orElse("unKnown");
        System.out.println("stuName="+stuName);

        stu = new Student();
        stu.setName("king");

        stuName = Optional.ofNullable(stu).map(Student::getName).orElse("unKnown");
        System.out.println("stuName="+stuName);


//        String teacherName = Optional.ofNullable(stu).map(Student::getTeacher).o


//        Optional<Teacher> optional = Optional.ofNullable(stu.getTeacher());
//        Teacher teacher = optional.orElse(stu.getTeacher());
//
//        System.out.println("teacher="+teacher);

    }


    public static void optionalGetTeacherName(){

        Student stu =null;
//        Student stu = new Student();


//       String teacherName =  Optional.ofNullable(stu).flatMap(Student::getTeacher).map(Teacher::getName).orElse("unknown");
        String teacherName =  Optional.ofNullable(stu).map(Student::getTeacher).map(Teacher::getName).orElse("unknown");

        System.out.println("teacherName="+teacherName);

//       Optional<String> stringOptional=  Optional.ofNullable(stu).flatMap(Student::getTeacher)

//        System.out.println("teacherName="+stringOptional.get());


        stu = new Student();
        Teacher t = new Teacher();
        t.setName("laoshi");
        stu.setTeacher(t);

        teacherName =  Optional.ofNullable(stu).map(Student::getTeacher).map(Teacher::getName).orElse("unknown");

        System.out.println("teacherName1="+teacherName);


//        teacherName =  Optional.ofNullable(stu).flatMap(Optional.ofNullable(new Teacher())).map(Teacher::getName).orElse("unknown");
//        teacherName =  Optional.ofNullable(stu).flatMap(Optional.ofNullable(new Teacher())).map(Teacher::getName).orElse("unknown");
//        teacherName =  Optional.ofNullable(stu).flatMap(Optional.ofNullable(Student::getTeacher)).map(Teacher::getName).orElse("unknown");
//
//        System.out.println("teacherName1="+teacherName);



    }



}

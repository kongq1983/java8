package com.kq.supplier;

import com.kq.entity.Student;

import java.util.function.Supplier;

/**
 * MySupplierDemo
 *
 * @author kq
 * @date 2019-12-04
 */
public class MySupplierDemo {

    public static void main(String[] args) {

        Student stu = createStudent(()->{
            Student s = new Student();
            s.setId(1);
            s.setName("king");
            s.setAge(18);
            return s;
        });

        System.out.println("Student="+stu);

        Student stu1 = createStudent(()-> new Student());
        System.out.println("stu1="+stu1);

        Student stu2 = createStudent(Student::new);
        System.out.println("stu2="+stu2);
    }

    public static Student createStudent(Supplier<Student> s) {
        return s.get();
    }

}

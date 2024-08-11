package com.kq.sort;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest1 {
    public static void main(String[] args) {
        int[] ages = {18, 16, 22, 17, 20};


        List<Student> list = new ArrayList<>();
        for (int age : ages) {
            Student stu = new Student();
            stu.setAge(age);
            stu.setName("king" + age);
            list.add(stu);
        }

        System.out.println(list);
//    list.sort(Comparator.comparing(Student::getAge));

        Comparator<Student> comparator = (Student s1, Student s2) -> Integer.compare(s1.getAge() , s2.getAge());
        list.sort(comparator);
        System.out.println(list);


        Comparator<Student> comparator1 = (Student s1, Student s2) -> Integer.compare(s2.getAge() , s1.getAge());
        list.sort(comparator1);
        System.out.println(list);
    }


}

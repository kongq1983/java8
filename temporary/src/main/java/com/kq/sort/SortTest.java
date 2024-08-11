package com.kq.sort;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {
        int[] ages = {18, 16, 22, 17, 20};


        List<Student> list = new ArrayList();
        for (int age : ages) {
            Student stu = new Student();
            stu.setAge(age);
            stu.setName("king" + age);
            list.add(stu);
        }

        System.out.println(list);
        list.sort(Comparator.comparing(Student::getAge));
        System.out.println(list);
        //倒排 逆序
        list.sort(Comparator.comparing(Student::getAge).reversed());
        System.out.println(list);

        //年龄相等时，再跟进ID排序
        list.sort(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getId));
        System.out.println(list);
    }
}
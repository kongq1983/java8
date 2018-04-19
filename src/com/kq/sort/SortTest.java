package com.kq.sort;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

       public static void main(String[] args) {
            int[] ages= {18,16,22,17,20};


            List<Student> list = new ArrayList();
            for(int age : ages) {
                Student stu = new Student();
                ((Student) stu).setAge(age);
                ((Student) stu).setName("king"+age);
                list.add(stu);
            }

            System.out.println(list);
           list.sort(Comparator.comparing(Student::getAge));
           System.out.println(list);

        }
}
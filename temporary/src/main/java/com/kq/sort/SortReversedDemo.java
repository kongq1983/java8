package com.kq.sort;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.Comparator;
import java.util.List;

/**
 * SortReversedDemo
 *
 * @author kq
 * @date 2019-03-19
 */
public class SortReversedDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        System.out.println("list="+list);

        list.sort(Comparator.comparing(Student::getAge));

        System.out.println("list1="+list);

        //倒排
        list.sort(Comparator.comparing(Student::getAge).reversed());

        System.out.println("list2="+list);

        // 先根据id排序，如果相等再根据age排序
        list.sort(Comparator.comparing(Student::getId).thenComparing(Student::getAge));

        System.out.println("list3="+list);

    }

}

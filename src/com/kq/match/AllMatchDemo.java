package com.kq.match;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;

/**
 * Created by qikong on 2019/3/18.
 */
public class AllMatchDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        System.out.println(list);

        //allMatch 全部匹配
        boolean allOver18 = list.stream().allMatch(n-> n.getAge()>=18);
        System.out.println("所有的学生都大于18.  "+allOver18);

    }

}

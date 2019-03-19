package com.kq.match;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;

/**
 * Created by qikong on 2019/3/18.
 */
public class NoneMatchDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        System.out.println(list);


        //全都不匹配
        boolean noneMatchOver18 = list.stream().noneMatch(n-> n.getAge()>18);

        System.out.println("noneMatchOver18:"+noneMatchOver18);
    }

}

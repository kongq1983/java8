package com.kq.match;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;

/**
 * Created by qikong on 2019/3/18.
 */
public class AnyMatchDemo {

    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        System.out.println(list);

        //anyMatch 有一个匹配
        boolean isAnyOver18 = list.stream().anyMatch(s-> s.getAge()>18);

        System.out.println("isAnyOver18="+isAnyOver18);
    }

}

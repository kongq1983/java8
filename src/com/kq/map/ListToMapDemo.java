package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ListToMapDemo
 * 重复的key dmeo
 * @author kq
 * @date 2019-03-25
 */
public class ListToMapDemo {

    public static void main(String[] args) {

        //有重复的key
        List<Student> list = StudentData.getStudentListDuplicate();

        //会报重复的key异常
        try {
            Map<Integer, String> map = list.stream().filter(s -> s.getName() != null).collect(Collectors.toMap(Student::getAge, Student::getName));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

//        System.out.println(list.stream().filter(t -> t.getName() != null).collect(Collectors.toMap(TestDO::getId, TestDO::getName, (k1, k2) -> k1)));
        //去掉重复的key
        Map<Integer, String> map = list.stream().filter(s -> s.getName() != null).collect(Collectors.toMap(Student::getAge, Student::getName,(k1,k2)-> k1));
        System.out.println(map);


    }
}

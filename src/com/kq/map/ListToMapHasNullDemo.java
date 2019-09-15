package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ListToMapHasNullDemo
 * value为空 demo
 * @author kq
 * @date 2019-03-25
 */
public class ListToMapHasNullDemo  {


    public static void main(String args[]) {
        List<Student> list = StudentData.getStudentListHasNull();

        Map<Integer,String>  map = list.stream().filter( s-> s.getName()!=null).collect(Collectors.toMap(Student::getAge,Student::getName));

        System.out.println(map);

    }

}

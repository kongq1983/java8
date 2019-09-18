package com.kq.filter;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * MoreFilter
 *
 * @author kq
 * @date 2019-09-18
 */
public class MoreFilter {


    public static void main(String[] args) {
        List<Student> list = getStudentList(StudentData.getStudentList(),s-> s.getAge()>20);
        list.forEach(System.out::println);

        Consumer<String> consumer= p -> System.out.println(p);
        consumer.accept("18800008888");


    }

//    public static List<String> getStudentList(List<Student> list, Consumer<Student> p) {
//
//        List<Student> resultList = new ArrayList();
//        for(Student s : list) {
//            if(p.accept(s)){
//                resultList.add(s);
//            }
//        }
//
//        return resultList;
//
//    }

    public static List<Student> getStudentList(List<Student> list,Predicate<Student> p) {

        List<Student> resultList = new ArrayList();
        for(Student s : list) {
            if(p.test(s)){
                resultList.add(s);
            }
        }

        return resultList;

    }

}

package com.kq.stream;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by qikong on 2019/3/27.
 */
public class StreamMap {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,8,3,9,6,5,6,8);

        //每个元素*2
        List<Integer> doubleList = list.stream().map(i-> i*2).collect(Collectors.toList());

        System.out.println("doubleList="+doubleList);

        StudentData.getStudentList().stream().map(d->d.getName()).forEach(System.out::println);

        List<String> names = StudentData.getStudentList().stream().map(d->d.getName()).collect(Collectors.toList());
        names.forEach(System.out::println);


        String[] words = {"Hello","World"};

        //{H,e,l,l,o},{W,o,r,l,d}
        Stream<String[]> stream = Arrays.stream(words).map(w-> w.split("")); //Stream<String[]>

        //H,e,l,l,o,W,o,r,l,d
        Stream<String> stringStream = stream.flatMap(Arrays::stream);

        stringStream.distinct().forEach(System.out::println);


    }

}

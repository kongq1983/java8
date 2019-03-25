package com.kq.consumer;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by qikong on 2019/3/25.
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        simpleTestConsumer(StudentData.getStudentList(), a-> System.out.println(a));

        simpleBiConsumer(StudentData.getStudentList(),(a,s)-> System.out.println(a.getName()+"_"+s),"end");

    }

    private static void simpleTestConsumer(List<Student> list, Consumer<Student> consumer){
        for(Student s : list) {
            consumer.accept(s);
        }
    }


    private static void simpleBiConsumer(List<Student> list, BiConsumer<Student,String> consumer,String str){
        for(Student s : list) {
            consumer.accept(s,str);
        }
    }

}

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

        Consumer<String> consumer= p -> System.out.println(p);
        consumer.accept("18800008888");
        StringBuilder string = new StringBuilder();
        BiConsumer<String,Integer> consumer1 = (s,i)-> string.append(s+"_"+i);
        consumer1.accept("king",8);
        System.out.println(string.toString());



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

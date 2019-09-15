package com.kq.predicate;

import com.kq.data.StudentData;
import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

/**
 * Created by qikong on 2019/3/25.
 */
public class PredicateDemo {

    public static void main(String[] args) {
        //intpredicate demo
        IntPredicate predicate = (int i)-> i%2==0;
        boolean test = predicate.test(98);
        System.out.println("98 is "+test);


        //bizpredicate demo
        List<Student> list = filterByBiPredicate(StudentData.getStudentList(),(name,age)-> name.startsWith("king") && age >20);
        System.out.println(list);

    }


    private static List<Student> filterByBiPredicate(List<Student> list, BiPredicate<String,Integer> predicate) {
        List<Student> result = new ArrayList<>();

        for(Student p : list) {
            if(predicate.test(p.getName(),p.getAge()))
                result.add(p);
        }

        return result;

    }

}

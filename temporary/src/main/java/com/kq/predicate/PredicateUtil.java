package com.kq.predicate;

import com.kq.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by qikong on 2019/3/17.
 */
public class PredicateUtil {

    private static Predicate<Student> getAgePredicate(final int age) {
        Predicate<Student> predicate = p -> p.getAge() > 20;
        return predicate;
    }


    static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {
        Collection<T> collection = new ArrayList<>();

        for (T t : c) {
            if (p.test(t)) {
                collection.add(t);
            }
        }

        return collection;

    }

    public static List<Student> getStudentList(List<Student> list, int age) {
        return list.stream().filter(getAgePredicate(age)).collect(Collectors.toList());
    }

}

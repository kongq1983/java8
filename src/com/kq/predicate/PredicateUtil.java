package com.kq.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Created by qikong on 2019/3/17.
 */
public class PredicateUtil {


    static <T> Collection<T> filter(Collection<T> c , Predicate<T> p) {
        Collection<T> collection = new ArrayList<>();

        for(T t : c){
            if(p.test(t)){
                collection.add(t);
            }
        }

        return collection;

    }


}

package com.kq.consumer;

import com.kq.entity.Person;
import com.kq.entity.Student;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by qikong on 2019/3/26.
 */
public class MethodReference {


    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> System.out.println(s);

        useConsumer(consumer,"Hello King!");


        useConsumer(s-> System.out.println(s),"Hello KingKong!");

        useConsumer(System.out::println,"Hello KingKing!");


        int value = Integer.parseInt("888");

        Function<String,Integer> f = Integer::parseInt;
        Integer result = f.apply("888");
        System.out.println("result="+result);
        System.out.println("value="+value);


        BiFunction<String,Integer,Character> f2 = String::charAt;
        Character c = f2.apply("hello",2);
        System.out.println("c="+c);

        String str = new String("Hello");
        Function<Integer,Character> f3 = str::charAt;
        Character c2 = f3.apply(4);
        System.out.println("c2="+c2);


        Supplier<String> supplier = String::new;
        String s = supplier.get();
        System.out.println("s="+s);

        BiFunction<String,Integer,Person> person = Person::new;

        Person  p = person.apply("king",28);
        System.out.println("p="+p);





    }


    private static <T> void useConsumer(Consumer<T> consumer ,T t){
        consumer.accept(t);
        consumer.accept(t);
    }


}

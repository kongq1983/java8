package com.kq.combination;

import com.kq.data.StudentData;
import com.kq.entity.Person;
import com.kq.entity.Student;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.*;

/**
 * java.util.function工具包例子
 * CombinationDemo
 * 函数型T ->R，完成参数类型T向结果类型R的转换。核心函数接口Function、Operater
 * 判断型T->boolean，核心函数接口Predicate
 * 消费型T->void，核心函数接口Consumer
 * 供给型void->T，核心函数接口Supplier
 * @author kq
 * @date 2019-09-18
 */
public class CombinationDemo {

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "ABC";

        Random random = new Random();

        Consumer<String> consumer= p -> System.out.println(p);
        consumer.accept("welcome to lambda!");

        BiConsumer<String,Integer> biConsumer = (s,i)-> System.out.println(s+"="+i);
        biConsumer.accept("one",1);

        BiFunction<String,Integer,String> biFunction = (s,i)-> s+"="+i;
        String result = biFunction.apply("one",1);
        System.out.println("biFunction result = "+result);

        functionList(StudentData.getStudentList(),s->s.getAge()>20,(s,i)-> System.out.println((s+"="+i)));

        //BinaryOperator 例子
        BinaryOperator<Integer> add = (n1, n2) -> n1 + n2;
        System.out.println(add.apply(4, 5));
        // BiPredicate
        BiPredicate<String,String> biPredicate = (str,suffix)-> str.endsWith(suffix);

        boolean isTrue = biPredicate.test("a.jpg","jpg");
        System.out.println("isTrue="+isTrue);

        BooleanSupplier stringEquals = () -> s1.equals(s2);
        System.out.println("stringEquals="+stringEquals.getAsBoolean());
//        Consumer<String> consumer2 = p-> CombinationDemo::println();

        DoubleBinaryOperator doubleBinaryOperator = (d1,d2)-> d1+d2;
        double doubleValue = doubleBinaryOperator.applyAsDouble(8,10);
        System.out.println("doubleBinaryOperator="+doubleValue);

        // DoubleConsumer
        DoubleConsumer doubleConsumer = d-> System.out.println("d*d="+d*d);
        doubleConsumer.accept(10);

        // DoublePredicate
        DoublePredicate doublePredicate = d-> d>8;
        System.out.println(doublePredicate.test(10));

        // DoubleSupplier 得到double随机数
        DoubleSupplier doubleSupplier = ()-> random.nextDouble();
        System.out.println("doubleSupplier="+doubleSupplier.getAsDouble());

        // 得到uuid
        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        System.out.println("uuid="+uuidSupplier.get());

        //DoubleToIntFunction
        DoubleToIntFunction doubleToIntFunction = d-> (int)(d);
        System.out.println("doubleToIntFunction="+doubleToIntFunction.applyAsInt(10.5));


        DoubleUnaryOperator doubleUnaryOperator = d-> d+10;
        System.out.println("doubleUnaryOperator="+doubleUnaryOperator.applyAsDouble(8));

        //返回自己
        DoubleUnaryOperator selfDoubleUnaryOperator = DoubleUnaryOperator.identity();
        System.out.println("selfDoubleUnaryOperator="+selfDoubleUnaryOperator.applyAsDouble(10));

        // Function 单参数
        Function<String, Person> function1 = s-> new Person(s);
        System.out.println("function1="+function1.apply("king"));

        // BiFunction 两个参数
        BiFunction<String,String,Person> function2 = (p1,p2)-> new Person(p1,p2);
        System.out.println("function2="+function2.apply("king","kong"));


    }

    private static void functionList(List<Student> list, Predicate<Student> p,BiConsumer<String, Integer> biConsumer) {
        if(list!=null) {
            for(Student s : list) {
                if(p.test(s)) {
                    biConsumer.accept(s.getName(), s.getAge());
                }
            }
        }
    }

    public static void println(String str) {
        System.out.println(str);
    }

}

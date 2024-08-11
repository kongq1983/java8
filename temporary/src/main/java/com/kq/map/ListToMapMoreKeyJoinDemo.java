package com.kq.map;

import com.kq.data.StudentData;
import com.kq.entity.Student;
import com.kq.functiondemo.ThreeFunction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author kq
 * @date 2020-07-09 15:31
 * @since 2020-0630
 */
public class ListToMapMoreKeyJoinDemo {

    public static void main(String[] args) {
        //有重复的key
        List<Student> list = StudentData.getStudentListDuplicate();

        //会报重复的key异常
        try {
            Map<Integer, String> map = list.stream().filter(s -> s.getName() != null).collect(Collectors.toMap(Student::getAge, Student::getName));
        }
        catch(Exception e){
            System.out.println("exception:"+e.getMessage());
        }

//        System.out.println(list.stream().filter(t -> t.getName() != null).collect(Collectors.toMap(TestDO::getId, TestDO::getName, (k1, k2) -> k1)));
        //去掉重复的key
//        Map<Integer, String> map = list.stream().filter(s -> s.getName() != null).collect(Collectors.toMap(Student::getAge, Student::getName,(k1,k2)-> k1));

        Map<Integer, String> map = list.stream().filter(s -> s.getName() != null).collect(Collectors.toMap(Student::getAge, Student::getName,(k1,k2)-> k1));
        System.out.println("map:"+map);

        // 多个值组成key
        Map<String, String> map1 = list.stream().collect(Collectors.toMap(k -> k.getName()+"_"+k.getAge(),Student::getName, (k1,k2)-> k1));
        System.out.println("map1:"+map1);

        // 多个值组成key
        Map<String, Integer> map2 = list.stream().collect(Collectors.toMap(k -> k.getName()+"_"+k.getAge(),Student::getAge, (k1,k2)-> k1));
        System.out.println("map1:"+map2);

        // 多个值组成key  多个值组成value
        Map<String, String> map3 = list.stream().collect(Collectors.toMap(k -> k.getName()+"_"+k.getAge(),v-> v.getId()+"_"+v.getName(), (k1,k2)-> k1));
        System.out.println("map1:"+map3);

        // function
        ThreeFunction<String,String,String,String> threeFunction = (id, name, age) -> id+"_"+name+"_"+age;
        // 多个值组成key
        Map<String, Integer> map5 = list.stream().collect(Collectors.toMap(k -> threeFunction.apply(k.getId()+"",k.getName(),k.getAge()+""),Student::getAge, (k1,k2)-> k1));
        System.out.println("map1:"+map5);

    }

}

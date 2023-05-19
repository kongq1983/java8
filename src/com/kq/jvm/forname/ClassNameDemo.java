package com.kq.jvm.forname;

/**
 * @author kq
 * @date 2021-12-27 11:02
 * @since 2020-0630
 */
public class ClassNameDemo {

    // Class.c
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName(MyDto.class.getName());

        MyDto.class.getDeclaredMethods();
        clazz.getClass();

        MyDto1 myDto1 = new MyDto1();
        MyDto1 myDto2 = new MyDto1();

        // c1 c2 c3 都是同一个
        Class c1 = myDto1.getClass();
        Class c2 = myDto2.getClass();
        Class c3 = MyDto1.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }

}

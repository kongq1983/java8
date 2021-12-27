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
    }

}

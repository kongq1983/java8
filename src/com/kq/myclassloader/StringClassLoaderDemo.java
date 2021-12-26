package com.kq.myclassloader;

/**
 * StringClassLoaderDemo
 *
 * @author kq
 * @date 2021-12-19 16:18
 * @since 1.0.0
 */
public class StringClassLoaderDemo {

    public static void main(String[] args) {

        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader:"+classLoader);

        String.class.getAnnotations();

//        Class<String> clazz = new Class<>();

//        String.class.getAnnotation();

    }

}

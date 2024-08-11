package com.kq.myclassloader;

/**
 * ClassLoaderDemo
 *
 * @author kq
 * @date 2021/4/8 21:32
 * @since 1.0.0
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoaderDemo.class.getClassLoader();
        System.out.println("classLoader="+classLoader);

        while (classLoader!=null) {
            classLoader = classLoader.getParent();
            System.out.println("classLoader="+classLoader);
        }


    }


}

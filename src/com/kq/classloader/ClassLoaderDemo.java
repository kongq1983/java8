package com.kq.classloader;

/**
 * @author kq
 * @date 2021-04-08 13:38
 * @since 2020-0630
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoaderDemo.class.getClassLoader();
        int index = 0;
        System.out.println("classLoader = "+ (index++)+" ," +classLoader);
        while (classLoader!=null) {
            classLoader = classLoader.getParent();
            System.out.println("classLoader = "+ (index++)+" ," +classLoader);
        }

    }

}

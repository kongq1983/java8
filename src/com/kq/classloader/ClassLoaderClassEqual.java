package com.kq.classloader;

/**
 * ClassLoaderClassEqual
 *
 * @author kq
 * @date 2021-12-26 22:23
 * @since 1.0.0
 */
public class ClassLoaderClassEqual {

    static class StringClassLoaderOne extends ClassLoader {

    }

    public static void main(String[] args) throws ClassNotFoundException {

        StringClassLoader cl = new StringClassLoader();
        Class c1 = cl.loadClass(ClassLoaderDemo.class.getName());
        Class c2 = cl.loadClass(ClassLoaderDemo.class.getName());

        if(c1==c2) {
            System.out.println("c1==c2");
        }else {
            System.out.println("c1!=c2");
        }

        System.out.println(c1.getClassLoader()); //AppClassLoader@18b4aac2

        StringClassLoader cl1 = new StringClassLoader();
//        StringClassLoaderOne cl1 = new StringClassLoaderOne();
        Class c3 = cl1.loadClass(ClassLoaderDemo.class.getName());

        if(c1==c3) {
            System.out.println("c1==c3");
        }else {
            System.out.println("c1!=c3");
        }

        System.out.println(ClassLoaderDemo.class.getName());
        System.out.println(c3.getClassLoader()); // AppClassLoader@18b4aac2

    }

}

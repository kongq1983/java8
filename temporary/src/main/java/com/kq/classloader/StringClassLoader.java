package com.kq.classloader;

/**
 * StringClassLoader
 *
 * @author kq
 * @date 2021-12-26 22:16
 * @since 1.0.0
 */
public class StringClassLoader extends ClassLoader{

    public static void main(String[] args) throws ClassNotFoundException {
        StringClassLoader cl = new StringClassLoader();
        Class clazz = cl.loadClass(String.class.getName()); // 因为String是jvm加载的
        System.out.println(clazz.getClassLoader()); // null  BootStrapClassLoader

        Class classLoaderDemo = cl.loadClass(ClassLoaderDemo.class.getName());
        System.out.println(classLoaderDemo.getClassLoader()); // AppClassLoader

    }

}

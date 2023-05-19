package com.kq.jvm.stringtable;

/**
 * -XX:+PrintStringTableStatistics
 * @author kq
 * @date 2021-10-22 11:10
 * @since 2020-0630
 */
public class StringDemo {

    private static boolean result;

    public static void main(String[] args) throws Exception{
        String str = "stringtable";
        String str1 = "hello";
        String str2 = "class";
        String str3 = new String("clazz");

        System.out.println(str3=="glad");

        System.out.println("str="+str);
        System.out.println("str2="+str2.intern());

        System.out.println("result="+result);

        Thread.sleep(1000*3600);

    }

}

package com.kq.jvm.stringtable;

import java.util.concurrent.TimeUnit;

/**
 * @author kq
 * @date 2021-10-22 14:04
 * @since 2020-0630
 */
public class StringInternDemo {

    public static final Integer NUMA = 10;
    // constantsValue
    public static final int NUMB = 8;
    int NUMC = 2;
    Integer NUMD = 1;

    public static void main(String[] args) throws Exception{
        String str2 = "clazz";

        String str3 = new String("good");
        String str5 = "good";
        Integer num = 10;
        int num1 = 6;

        String str4 = str3.intern();
        String str7 = str5.intern();
        System.out.println("str7="+str7);
        System.out.println(num+","+num1);
        System.out.println(str3==str4);
        System.out.println("good"==str4);
        System.out.println("str5="+str5);

        System.out.println("result="+str3.intern());

        TimeUnit.MINUTES.sleep(60);

    }

}

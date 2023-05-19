package com.kq.jvm.stringtable;

import java.util.concurrent.TimeUnit;

/**
 * com.kq.jvm.stringtable.MyTestString
 * @author kq
 * @date 2021-11-16 8:28
 * @since 2020-0630
 */
public class MyTestString {

    String str = "hello";
    //
    String str1 = new String(str);
    String str2 = new String(str1);

    // 上面3个String各不相同，value是共享的

    private String a = "a";
    private String b = "a";

    String ab1 = new String(a+b);
    String ab2 = new String(a+b);

    // 上面2个String各不相同，value也各不相同


    String ac1 = new String("a"+"c");
    String ac2 = new String("a"+"c");

    // 上面2个String各不相同，value是共享的

    //上面3个value都是同一个  但String个不相同

    // 将一个本地变量加载到操作数栈 aload_1
    // 将一个数值从操作数栈存储到局部变量表的指令   astore_2
    public static void main(String[] args) throws Exception{

        MyTestString myTestString = new MyTestString();
        System.out.println(myTestString.str2);
        System.out.println(myTestString.ab1);
        System.out.println(myTestString.ab2);
        System.out.println(myTestString.ac1);
        System.out.println(myTestString.ac2);


        TimeUnit.MINUTES.sleep(60);


    }

}

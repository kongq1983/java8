package com.kq.jvm;

/** -XX:+PrintStringTableStatistics
 * @author kq
 * @date 2021-04-22 8:46
 * @since 2020-0630
 */
public class StringTest {


    public static void main(String[] args) {

        String str1 = new String("你好");
        System.out.println(str1==str1.intern()); // false

        String str2 = new String("main");
        System.out.println(str2==str2.intern()); // true



    }

}

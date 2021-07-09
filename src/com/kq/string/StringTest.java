package com.kq.string;

/**
 * @author kq
 * @date 2021-05-21 10:35
 * @since 2020-0630
 */
public class StringTest {

    public static void main(String[] args) {

//        String str = "";
//
//        for(int i=0;i<65538;i++) {
//            str+="1";
//        }
//        System.out.println(str);
//        System.out.println(str.intern());
//        System.out.println(str.intern()==str.intern());

        String str = "one";
        String two = "one";
        String two1 = new String("one");

        System.out.println(str==two);
        System.out.println(str==two1);


    }

}

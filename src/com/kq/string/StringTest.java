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

        String str1 = "good";

        String str2 = "go";

        String str3 = str2 + "od";

        str3 = str3.intern();

        System.out.println(str2==str3);

        String str5 = "good";

        System.out.println(str1==str5);

        String str6 = new String("good");
        System.out.println(str1==str6);
        str6 = str6.intern();

        System.out.println(str1==str6);


    }

}

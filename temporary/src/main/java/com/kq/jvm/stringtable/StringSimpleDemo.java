package com.kq.jvm.stringtable;

/**
 * @author kq
 * @date 2021-11-03 9:31
 * @since 2020-0630
 */
public class StringSimpleDemo {

    public String getName(String name){
        String a = "abc";
        String b = "bbc";
        return name;
    }

    public static void main(String[] args) {
        String name0 = "getName";
        String name1 = "name";
        String address1 = "address";
        System.out.println(name1+","+address1);
    }

}

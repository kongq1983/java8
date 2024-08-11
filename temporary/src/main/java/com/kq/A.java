package com.kq;

/**
 * A
 *
 * @author kq
 * @date 2019-04-23
 */
public class A {

    public static void main1(String[] args) {
        String a = "a";
        String b = "a";

        int[] totalIndex = new int[]{0};
        System.out.println(a==b);
        System.out.println(totalIndex[0]);

        String packageName = A.class.getPackage().getName();
        String className = A.class.getCanonicalName();

        System.out.println("packageName="+packageName);
        System.out.println("className="+className);

    }

    public static void main(String[] args) {
        //0000 0001
        //0000 1000
        int size = 1 << 3;

        System.out.println(size);
    }

}

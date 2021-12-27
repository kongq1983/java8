package com.kq.jvm.classinitial.parentchild;

/**
 * @author kq
 * @date 2021-12-27 9:55
 * @since 2020-0630
 */
public class ChildA extends ParentA{

//    public static String NAME = "ChildA";

    static {
        System.out.println("ChildA is execute.");
    }

}

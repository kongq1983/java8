package com.kq.jvm.classinitial.parentchild;

/**
 * @author kq
 * @date 2021-12-27 9:55
 * @since 2020-0630
 */
public class ParentA {

    public static String NAME = "ParentA";

    static {
        System.out.println("ParentA is execute.");
    }

}

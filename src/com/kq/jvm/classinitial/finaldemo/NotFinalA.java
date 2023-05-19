package com.kq.jvm.classinitial.finaldemo;

/**
 * @author kq
 * @date 2021-12-27 9:18
 * @since 2020-0630
 */
public class NotFinalA {
    //  非final 需要链接的准备阶段赋值
    public static String NAME = "NotFinalA";

    static {
        System.out.println("FinaNotFinalAlA is execute");
    }

}

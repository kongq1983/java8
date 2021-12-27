package com.kq.jvm.classinitial.finaldemo;

/**
 * @author kq
 * @date 2021-12-27 9:18
 * @since 2020-0630
 */
public class FinalA {
    // final 在编译的时候 就已经确定了
    public static final String NAME = "FinalA";
    public static final String NAME1 ; //  这个还是会的 ，因为初始化在clinit中

    static { // 如果直接调用System.out.println(FinalA.NAME); 则不会打印
        System.out.println("FinalA is execute");
        NAME1 = null;
    }

}

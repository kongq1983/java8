package com.kq.jvm.classinitial.parentchild;

import java.util.concurrent.TimeUnit;

/**
 * @author kq
 * @date 2021-12-27 9:56
 * @since 2020-0630
 */
public class ParentChildDemo {

    ChildA childA = new ChildA();
    ParentA parentA = new ParentA();

    public static void main(String[] args) throws Exception{
        System.out.println(ChildA.NAME);

        new ParentChildDemo().childA.toString();
        new ParentChildDemo().parentA.toString();

        TimeUnit.MINUTES.sleep(60);
    }

}

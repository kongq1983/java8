package com.kq.jvm.stringtable;

import java.util.concurrent.TimeUnit;

/**
 * @author kq
 * @date 2021-11-15 9:10
 * @since 2020-0630
 */
public class TestObjectMain {

    TestObject t = new TestObject();

    public void hello(){
        System.out.println("t="+t);
    }

    // scanoops 0x000000076b180000 0x000000076f180000 com.kq.jvm.stringtable.TestObject
    public static void main(String[] args) throws Exception{
        TestObjectMain mm = new TestObjectMain();
        mm.hello();

        String aa = "aa1";
        String bb = "bb1";
        String cc = aa+bb;

        TestObject t1 = new TestObject();
        TestObject t2 = new TestObject();

        t1.setStr(cc);
        t1.setStrinter(cc.intern());
        t2.setStr(cc);
        t2.setStrinter(cc.intern());

        System.out.println(t1);
        System.out.println(t2);

        TimeUnit.MINUTES.sleep(600);


    }

}

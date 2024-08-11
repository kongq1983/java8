package com.kq.jvm.field;

import java.util.concurrent.TimeUnit;

/**
 * -XX:-UseCompressedOops
 * mem 0x00000001104a5ec0 2
 * whatis 0x00000001104a35c8
 * https://www.bbsmax.com/A/A2dme1xxde/
 * com.kq.jvm.field.C
 * @author kq
 * @date 2021-11-17 14:01
 * @since 2020-0630
 */
public class FieldMain {

    A a = new A();
    B b = new B();
    C c = new C();

    public static void main(String[] args) throws Exception{

        FieldMain fieldMain = new FieldMain();

        System.out.println(fieldMain);
        System.out.println(fieldMain.a);
        System.out.println(fieldMain.b);
        System.out.println(fieldMain.c);
        System.out.println(fieldMain.c.f);
        System.out.println(A.PAGE_SIZE);
        System.out.println(A.getPageSize());

        TimeUnit.MINUTES.sleep(600);

    }

}

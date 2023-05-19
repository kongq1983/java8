package com.kq.jvm.field;

/**
 *
 * @author kq
 * @date 2021-11-17 13:55
 * @since 2020-0630
 */
public class A {

    public static final int PAGE_SIZE = 20;
    public static final byte BYTEBYTE = 50;
    public static final double DOU = 50;
    public static final float FLO = 60;

    private int a = 10;
    protected int b = 12;
    public int c = 15;
    public int d = 11;
    public int f = 16;

    public char cByte = 10;
    public double dou1 = 1;
    public byte aByte = 1;


    public static int getPageSize(){
        return PAGE_SIZE;
    }


}

package com.kq.jvm;

/**
 *  deep of calling = 43179
 *  java.lang.StackOverflowError
 *  指定参数 -Xss256K  加大递归数  还是会报错
 */
public class StackOverflowErrorDemo {

    private static int count = 0;
    public static void recursion(){
        count++;
        recursion(); //一直递归
    }

    public static void main(String[] args) {
        try{
            recursion();
        }catch (Throwable e) {
            System.out.println("deep of calling = "+count);
            e.printStackTrace();
        }
    }

}

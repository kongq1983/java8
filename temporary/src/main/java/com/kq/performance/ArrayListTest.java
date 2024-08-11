package com.kq.performance;

import java.util.ArrayList;

/**
 * @author kq
 * @date 2020-11-24 15:39
 * @since 2020-0630
 */
public class ArrayListTest {

    public static void main(String[] args) {

        int number = 1000000;
        int times = 50;

        long startTime = System.currentTimeMillis();

        for(int i=0;i<times;i++){
            ArrayList list = new ArrayList();
            for(int j=0;j<number;j++) {
                list.add(i+"");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("first spent time : "+((endTime-startTime)));


        startTime = System.currentTimeMillis();

        for(int i=0;i<times;i++){
            ArrayList list = new ArrayList(number+1);
            for(int j=0;j<number;j++) {
                list.add(i+"");
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("second spent time : "+((endTime-startTime)));

    }

}

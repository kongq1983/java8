package com.kq.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * OutOfMemoneyDemo
 * -server -Xms10m -Xmx20m
 * @author kq
 * @date 2019-12-04
 */
public class OutOfMemoneyDemo {

    public static void main(String[] args) throws Exception{

        Runnable runnable = ()-> {
            while (true) {
                System.out.println("-Xmx" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
                System.out.println("totalMemory=" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
                System.out.println("freeMemory=" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
                try {
                    Thread.sleep(2000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        List<byte[]> list = new ArrayList<>();


        for(int i=0;i<1000;i++) {
            //1m
            byte[] bs = new byte[1024*1024];
            list.add(bs);
            System.out.println("i="+i);
            Thread.sleep(1000);
        }






        Thread.sleep(1000*60L);
    }


}

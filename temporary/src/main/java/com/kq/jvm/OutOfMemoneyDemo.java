package com.kq.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * OutOfMemoneyDemo -Xmn1000m
 * d:/log/gclog目录需要手工创建
 * -server -Xms10m -Xmx20m -Xloggc:d:/log/gclog/shr-gc.log -XX:+PrintGCDetails -XX:+PrintGCApplicationStoppedTime -Xloggc:d:/log/shr-gc.log
 * -server -Xms10m -Xmx20m -Xloggc:d:/log/gclog/shr-gc.log -XX:+PrintGCDateStamps
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
            //默认1s
            Thread.sleep(10000);
        }






        Thread.sleep(1000*60L);
    }


}

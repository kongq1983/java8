package com.kq.jvm;


import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryMXBean;

/**
 * 打印-Xmx  -Xms
 * -Xmx32m
 * maxMemory是拿到的程序最大可以使用的内存，
 * 我们知道 ，Survivor有两个，但只有1个会用到，
 * 另一个一直闲置。所以这个值maxMemory是去掉一个Survivor空间的值
 * maxMemory=Eden+Survivor+Old Gen
 */
public class PrintMemoryDemo {

    static String mb(long s) {
        return String.format("%d (%.2f M)", s, (double) s / (1024 * 1024));
    }

    public static void main(String[] args) {
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1024/1024+"M");
        System.out.println("totalMemory="+Runtime.getRuntime().totalMemory()/1024/1024+"M");
        System.out.println("freeMemory="+Runtime.getRuntime().freeMemory()/1024/1024+"M");

        System.out.println("Runtime max: " + mb(Runtime.getRuntime().maxMemory()));
        MemoryMXBean m = ManagementFactory.getMemoryMXBean();

        System.out.println("Non-heap: " + mb(m.getNonHeapMemoryUsage().getMax()));
        System.out.println("Heap: " + mb(m.getHeapMemoryUsage().getMax()));

        for (MemoryPoolMXBean mp : ManagementFactory.getMemoryPoolMXBeans()) {
            System.out.println("Pool: " + mp.getName() + " (type " + mp.getType() + ")" + " = " + mb(mp.getUsage().getMax()));
        }

    }

}

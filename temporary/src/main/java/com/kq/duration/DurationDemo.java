package com.kq.duration;

import java.time.Duration;
import java.time.Instant;

/**
 * DurationDemo
 *
 * @author kq
 * @date 2019-10-31
 */
public class DurationDemo {

    public static void main(String[] args) throws Exception{

        // 相差几秒
        Instant start = Instant.now();
        Thread.sleep(3000L);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);

        System.out.println(duration.getSeconds());


        //添加几天
        Duration begin = Duration.ZERO;
        Duration after1Days = begin.plusDays(1);
        //86400s
        System.out.println(after1Days.getSeconds());

    }

}

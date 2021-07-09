package com.kq.sign;

import java.util.concurrent.TimeUnit;

/**
 * @author kq
 * @date 2021-06-24 13:59
 * @since 2020-0630
 */
public class TimeUnitTest {

    public static void main(String[] args) {

        long time = Math.max(TimeUnit.SECONDS.toNanos(5), 3);
        System.out.println(time);

        int n = 300;

        n-= 1000- 800;

        System.out.println(n);

    }


}

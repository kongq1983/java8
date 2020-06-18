package com.kq.time;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {
        // LocalTime 用于表示当天时间。和java.util.Date不同，它只有时间，不包含日期

        //现在时间
        LocalTime time = LocalTime.now();
        System.out.println("现在时间=" + time);

        // 增加2小时
        LocalTime time1 = LocalTime.now();
        LocalTime newTime = time1.plusHours(2);
        System.out.println("newTime=" + newTime);


    }

}

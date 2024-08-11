package com.kq.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String now() {
        return threadLocal.get().format(new Date());
    }


    public static void main(String[] args) {
        System.out.println(now());
    }

}

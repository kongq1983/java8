package com.kq.cron;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeToCronDemo {

    /**
     * 仅一次
     *
     * @param dateStr   2022-03-31 09:51:05
     * @return
     */
    public static String onlyOnce(String dateStr) {
        LocalDateTime time = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String cronStr = time.format(DateTimeFormatter.ofPattern("ss mm HH dd MM ? yyyy"));
        return cronStr;
    }

    /**
     * 每天
     * @param timeStr   09:51:05
     * @return
     */
    public static String everyDay(String timeStr) {
        LocalTime time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
        String cronStr = time.format(DateTimeFormatter.ofPattern("ss mm HH * * ?"));
        return cronStr;
    }

    /**
     * 每周
     * @param timeStr   09:51:05
     * @param week      1代表周日 7代表周六 可选值：1、2、3、4、5、6、7、1-5、1-7
     * @return
     */
    public static String everyWeek(String timeStr, String week) {
        LocalTime time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
        String cronStr = time.format(DateTimeFormatter.ofPattern("ss mm HH ? * " + week));
        return cronStr;
    }

    /**
     * 每月
     * @param dateStr   2022-03-31 09:51:05
     * @return
     */
    public static String everyMonth(String dateStr) {
        LocalDateTime time = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String cronStr = time.format(DateTimeFormatter.ofPattern("ss mm HH dd * ?"));
        return cronStr;
    }

    /**
     * 每年
     * @param dateStr   2022-03-31 09:51:05
     * @return
     */
    public static String everyYear(String dateStr) {
        LocalDateTime time = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String cronStr = time.format(DateTimeFormatter.ofPattern("ss mm HH dd MM *"));
        return cronStr;
    }


    public static void main(String[] args) {

        //仅一次   05 06 11 31 03 ? 2022
        String onlyOnce = onlyOnce("2022-03-31 11:06:05");
        System.out.println(onlyOnce);
        //每天    05 51 09 * * ?
        String everyDay = everyDay("09:51:05");
        System.out.println(everyDay);
        //每周    05 51 09 ? * 1
        String everyWeek = everyWeek("09:51:05","1");
        System.out.println(everyWeek);
        //每月    05 51 09 31 * ?
        String everyMonth = everyMonth("2022-03-31 09:51:05");
        System.out.println(everyMonth);
        //每年    05 51 09 31 03 *
        String everyYear = everyYear("2022-03-31 09:51:05");
        System.out.println(everyYear);

    }

}

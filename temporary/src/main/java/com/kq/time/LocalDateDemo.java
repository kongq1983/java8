package com.kq.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

    public static void main(String[] args) {

        //Java 8中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间
        LocalDate date = LocalDate.now();
        System.out.println("当前日期=" + date);

        LocalDate date1 = LocalDate.of(2000, 1, 1);
        System.out.println("千禧年=" + date1);

        LocalDate date2 = LocalDate.now();
        System.out.printf("年=%d， 月=%d， 日=%d \n", date2.getYear(), date2.getMonthValue(), date2.getDayOfMonth());

        LocalDate now = LocalDate.now();
        LocalDate date3 = LocalDate.of(2020, 6, 18);
        System.out.println("日期是否相等=" + now.equals(date3));

        // 增加1个礼拜 增加7天
        LocalDate addWeekDate = LocalDate.now().plus(1, ChronoUnit.WEEKS);
        System.out.println("addWeekDate=" + addWeekDate);

        // 增加1天
        LocalDate addOneDate = LocalDate.now().plus(1, ChronoUnit.DAYS);
        System.out.println("addOneDate=" + addOneDate);


        boolean isBefore = LocalDate.now().isBefore(LocalDate.of(2020, 12, 31));
        System.out.println("isBefore="+isBefore);

        boolean isAfter = LocalDate.now().isAfter(LocalDate.of(2020, 6, 1));
        System.out.println("isAfter="+isAfter);

        // 解析日期
        String dateText = "20200618";
        LocalDate parseDate = LocalDate.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("格式化之后的日期=" + parseDate);

        // 格式化日期
        dateText = parseDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("dateText=" + dateText);

    }

}

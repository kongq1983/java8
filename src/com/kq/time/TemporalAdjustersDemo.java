package com.kq.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {

    public static void main(String[] args) {

        // 今天
        LocalDate today = LocalDate.now();

        // 今年第1天
        LocalDate firstDayOfYear = today.with(TemporalAdjusters.firstDayOfYear());
        // 今年最后1天
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());


        // 本月第1天
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        // 本月最后1天
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());

        // 下月第1天
        LocalDate firstDayOfNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());

        // 明年第1天
        LocalDate firstDayOfNextYear = today.with(TemporalAdjusters.firstDayOfNextYear());

        //本月第1个星期6的日期
        LocalDate firstSaturdayInThisMonth = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));

        //上个星期五的日期  如果今天是星期五，则返回下周五的日期
        LocalDate previousSaturdayInThisMonth = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        //(往前包括当天)最近星期五的日期  如果今天是星期五，则返回今天日期
        LocalDate previousOrSameSaturdayInThisMonth = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));

        //下个星期五的日期  如果今天是星期五，则返回下周五的日期
        LocalDate nextSaturdayInThisMonth = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        //最近星期五的日期  如果今天是星期五，则返回今天日期
        LocalDate nextOrSameSaturdayInThisMonth = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));


        System.out.println("today="+today);
        System.out.println("本月第1天="+firstDayOfMonth);
        System.out.println("本月最后1天="+lastDayOfMonth);

        System.out.println("下月第1天="+firstDayOfNextMonth);

        System.out.println("本年第1天="+firstDayOfYear);
        System.out.println("本年最后1天="+lastDayOfYear);
        System.out.println("明年第1天="+firstDayOfNextYear);

        System.out.println("本月第1个星期6的日期="+firstSaturdayInThisMonth);
        System.out.println("previous上个星期五的日期="+previousSaturdayInThisMonth);
        System.out.println("previousOrSame上个星期五的日期="+previousOrSameSaturdayInThisMonth);
        System.out.println("next下个星期五的日期="+nextSaturdayInThisMonth);
        System.out.println("nextOrSame下个星期五的日期="+nextOrSameSaturdayInThisMonth);


    }

}

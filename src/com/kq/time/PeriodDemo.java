package com.kq.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {


    public static void main(String[] args) {

        // int years, int months, int days
//        Period period = Period.of(2, 3, 6);

        Period period = Period.ofDays(1);
        System.out.println("days="+period.getDays());
        System.out.println("months="+period.getMonths());


        Period yearPeriod = Period.of(1, 0, 0);
        System.out.println("years="+yearPeriod.getYears());
        System.out.println("months="+yearPeriod.getMonths());
        System.out.println("days="+yearPeriod.getDays());


        Period betweenPeriod = Period.between(
                LocalDate.of(2018, 1, 21),
                LocalDate.of(2020, 2, 21));

        System.out.println("years="+betweenPeriod.getYears());
        System.out.println("months="+betweenPeriod.getMonths());
        System.out.println("days="+betweenPeriod.getDays());
    }

}

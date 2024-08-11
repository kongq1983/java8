package com.kq.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {

    public static void main(String[] args) {

        Period betweenPeriod = Period.between(
                LocalDate.of(2018, 1, 21),
                LocalDate.of(2020, 1, 21));


        LocalDate date1 = LocalDate.of(2019, 1, 1);
        long diffDays = ChronoUnit.DAYS.between(date1,LocalDate.now());
        System.out.println("diffDays="+diffDays);
        long diffMonths = ChronoUnit.MONTHS.between(date1,LocalDate.now());
        System.out.println("diffMonths="+diffMonths);
        long diffYears = ChronoUnit.YEARS.between(date1,LocalDate.now());
        System.out.println("diffYears="+diffYears);


    }

}

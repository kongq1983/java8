package com.kq.localdatetime;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now().minusDays(5);
        System.out.println("now="+LocalDate.now());
        System.out.println("localDate="+localDate);
        System.out.println("localDate1="+LocalDate.now().plusDays(5));

    }

}

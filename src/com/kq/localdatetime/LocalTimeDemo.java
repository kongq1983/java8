package com.kq.localdatetime;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {

        String str = "10:15";

        LocalTime localTime = LocalTime.parse(str);

        System.out.println(localTime);

    }

}

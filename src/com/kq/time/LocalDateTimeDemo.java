package com.kq.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        // 綫程安全
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 現在時間转字符串
        LocalDateTime now = LocalDateTime.now();
        String nowTime = now.format(formatter);
        System.out.println("nowTime=" + nowTime);

        // 字符串转時間
        String datetimeText = "2020-06-18 18:18:18";
        LocalDateTime datetime = LocalDateTime.parse(datetimeText, formatter);
        System.out.println(datetime);
    }

}

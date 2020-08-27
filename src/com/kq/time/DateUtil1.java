package com.kq.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil1 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String dateToString(Date date)throws ParseException {
        synchronized(sdf){
            return sdf.format(date);
        }
    }

    public static Date stringToDate(String stringDate) throws ParseException{
        synchronized(sdf){
            return sdf.parse(stringDate);
        }
    }

    public static void main(String[] args) throws Exception{
        String date = dateToString(new Date());
        System.out.println(stringToDate(date));

    }


}

package com.kq.lambda;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MyStaticLambda {

    public static Runnable getRunnable(){
        return ()->{
            int index = 0;
            while (index<10) {
                System.out.println(LocalDateTime.now()+"------------------------- ");
                try {
                    TimeUnit.SECONDS.sleep(2);
                }catch (Exception e){
                    e.printStackTrace();
                }
                index++;
            }
        };
    }


    public static void main(String[] args) {
        new Thread(getRunnable()).start();
    }

}

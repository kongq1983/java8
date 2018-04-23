package com.kq.andthen;

import java.util.function.Function;

public class Letter {

    public static String addHeader(String text) {
        return "From Raoul,Mario and Alan:" + text;
    }

    public static String addFooter(String text){
        return text+" Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda","lambda");
    }

    public static void main(String[] args) {
        Function<String,String> addHeader = Letter::addHeader;
        Function<String,String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);

        String result = transformationPipeline.apply("labda , welcome to you !");
        System.out.println(result);

        Function<String,String> transformationPipeline1 = addHeader.andThen(Letter::addFooter);
        result = transformationPipeline1.apply("labda , welcome to you !");
        System.out.println(result);

    }

}

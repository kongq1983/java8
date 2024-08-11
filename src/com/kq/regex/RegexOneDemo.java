package com.kq.regex;

import java.util.Optional;

public class RegexOneDemo {


    public static void main(String[] args) {

//        String key = kv.getKey();
//        String value = Optional.ofNullable(kv.getValue()).orElse("").toString();
        String value = "2023-01-10";

        String key = "startOrderTime";


        String keyRegex = "{{"+key+".DATA}}";
//        String keyRegex = "\\{\\{"+key+".DATA}}";
        System.out.println("keyRegex="+keyRegex);


        String content = "您好{{userName.DATA}}！您可以预定{{startOrderTime.DATA}}至{{endOrderTime.DATA}}的餐了，请及时点餐{{saleType.DATA}}";
        System.out.println(content);

        content = content.replaceAll(keyRegex,value);

        System.out.println(content);


    }

}

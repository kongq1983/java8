package com.kq.format;

import java.util.UUID;

public class StringFormatDemo {

    /**
     * 第一个%s = 具体的orgId
     * 菜品编码是否显示缓存Key
     */
    public static final String PRODUCT_CODE_VIEW_KEY = "%s:product:code:view";

    public static void main(String[] args) {
        String str = String.format(PRODUCT_CODE_VIEW_KEY, UUID.randomUUID().toString().replaceAll("-",""));
        System.out.println(str);

        str = "int=%d";
        System.out.println(String.format(str,5));

        str = "float=%f";
        System.out.println(String.format(str,6.8));
        str = "float=%.2f";
        System.out.println(String.format(str,6.800));

        str = "boolean= %b";
        System.out.println(String.format(str,false));

        str = "char A= %c";
        System.out.println(String.format(str,'A'));

        Integer num =new Integer(2);
        if(num==2){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }

}

package com.kq.environment;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;


/**
 * 1. VM options  -Dkk1=123
 * 2. Program arguments  -kk2=223
 * 3. Environment variable (环境变量)
 * java.exe -Dkk1=123  E:\githubproject\java8\target com.kq.environment.SystemDemo --kk2=223
 */
public class SystemDemo {

    public static void main(String[] args) {

        printEnv();

//        printPropertes();
    }

    /**
     * 打印环境变量
     */
    private static void printEnv(){
        // 环境变量
        Map<String,String> envMap = System.getenv();

        for(Map.Entry<String, String> kv : envMap.entrySet()) {
            System.out.println(kv.getKey()+"="+kv.getValue());
        }
    }

    /**
     * 打印系统参数
     */
    private static void printPropertes(){
        // 环境变量
        Properties properties = System.getProperties();

        Enumeration<?> enumeration =  properties.propertyNames();

        while(enumeration.hasMoreElements()) {
            Object key = enumeration.nextElement();
            System.out.println(key+"="+properties.getProperty((String)key));
        }


        System.out.println(properties);


    }

}

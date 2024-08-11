package com.kq.sign;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * @author kq
 * @date 2021-06-23 14:14
 * @since 2020-0630
 */
public class MD5Utils {


    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code.toLowerCase();
    }

    public static String getSortedValue(Map<String,String> map ) {
        if(map==null || map.size()==0){
            return "";
        }

        StringBuilder str = new StringBuilder();
        for(Map.Entry<String,String> kv : map.entrySet()) {
            if(!kv.getKey().equals("sign")) {
                str.append(kv.getKey()).append("=").append(kv.getValue()).append("&");
            }
        }

        if(str.length()==0) {
            return "";
        }

        return str.substring(0,str.length()-1);

    }


    public static void main(String[] args) {
        String str = "123456";
        System.out.println(stringToMD5(str));

    }

}

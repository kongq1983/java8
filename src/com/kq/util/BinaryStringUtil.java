package com.kq.util;

/**
 * @author kq
 * @date 2020-07-15 14:03
 * @since 2020-0630
 */
public class BinaryStringUtil {

    public static final String getBinaryString(int num) {
        String binaryString = Integer.toBinaryString(num);

//        StringBuilder string = new StringBuilder();
//
//        int len = binaryString.length();
//        for(int i=len;i>0;i--) {
//            string.append(binaryString.substring(i-1,i));
//            if(i%4==0){
//                string.append(" ");
//            }
//        }

//        return string.toString();

        return binaryString;

    }

}

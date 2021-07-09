package com.kq.sign;

import java.util.Map;

/**
 * @author kq
 * @date 2021-06-23 13:58
 * @since 2020-0630
 */
public class Md5SignTest {

    public static void main(String[] args) {

        String key = "bxdc_ws_key";

        String url = "a.com?timestamp=100000000&orgId=a&tableId=1";

        Map<String,String> map = RequestUriUtils.getParams(url);

        String sortedValue1 = MD5Utils.getSortedValue(map);
        String md51 = MD5Utils.stringToMD5(sortedValue1);
        String sign = MD5Utils.stringToMD5(md51+key);
        System.out.println("md51="+md51+" sortedValue1: "+sortedValue1+" sign="+sign);
        map.put("sign",sign);

        String sortedValue2 = MD5Utils.getSortedValue(map);
        System.out.println("sortedValue2: "+sortedValue2);


        sign = map.remove("sign");
        System.out.println("获取sign : "+sign);

        System.out.println(map);


    }


}

package com.kq.match;

import java.util.ArrayList;
import java.util.List;

/**
 * Test
 *
 * @author kq
 * @date 2019-03-27
 */
public class Test {

    public static void main(String[] args) {
        List<String> saleTypeNames = new ArrayList<>();

//        for(String s : saleTypeNames) {
//            System.out.println(s);
//        }

        if(!saleTypeNames.contains("a")) {
            saleTypeNames.add("a");
        }

    }

}

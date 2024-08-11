package com.kq.staticdemo;

/**
 * Created by qikong on 2019/3/16.
 */
public class IParseTest {

    public static void main(String[] args) {
        //demo1
        IParse parse = new IParse() {
            @Override
            public int parse(String str) {
                return Integer.parseInt(str);
            }
        };

        int num = parse.parse("8");
        System.out.println("num="+num);

        //dmeo2
        IParse parse1 = str -> Integer.parseInt(str);
        System.out.println(parse1.parse("18"));


        //demo3
        IParse parse2 = Integer::parseInt;
        System.out.println(parse2.parse("28"));


    }

}

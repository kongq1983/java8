package com.kq.string;

/**
 * @author kq
 * @date 2021-05-24 14:56
 * @since 2020-0630
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        boolean result = (i1==i2);
        // true
        System.out.println("1. i1==i2 is "+result);

        i1 = 128;
        i2 = 128;

        result = (i1==i2);
        // false
        System.out.println("2. i1==i2 is "+result);

        i1 = 200;
        i2 = 200;

        result = (i1==i2);
        // false
        System.out.println("2. (200)i1==i2 is "+result);


        i1 = -127;
        i2 = -127;

        result = (i1==i2);
        // true
        System.out.println("3. i1==i2 is "+result);

        i1 = -128;
        i2 = -128;

        result = (i1==i2);
        // true
        System.out.println("4. i1==i2 is "+result);

        i1 = -129;
        i2 = -129;

        result = (i1==i2);
        // false
        System.out.println("5. i1==i2 is "+result);
    }

}

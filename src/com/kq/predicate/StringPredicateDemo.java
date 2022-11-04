package com.kq.predicate;

import java.util.function.Predicate;

/**
 *
 * Predicate为函数式接口，predicate的中文意思是“断定”，即判断的意思，判断某个东西是否满足某种条件；
 * 因此它包含test方法，根据输入值来做逻辑判断，其结果为True或者False
 *
 * @author kq
 * @date 2022-11-04 10:35
 * @since 2020-0630
 */
public class StringPredicateDemo {

    public static void main(String[] args) {

        Predicate<String> jpgP = o -> o.endsWith("jpg");
        Predicate<String> getP = o -> o.startsWith("get");

        String photoName = "a.jpg";
        boolean isJpg = jpgP.test(photoName);
        System.out.println(photoName+", isJpg="+isJpg);

        // 判断同时满足2个条件
        String photoName1 = "get_name.jpg";

        // 判断是否同时满足2个条件
        boolean both = jpgP.and(getP).test(photoName1);
        System.out.println(photoName1+", both="+both);


        Predicate<String> gifP = o -> o.endsWith("gif");
        Predicate<String> pngP = o -> o.endsWith("png");

        String photoName2 = "aaa.png";

        boolean isPhotoSuffix = jpgP.or(pngP).or(gifP).test(photoName2);
        System.out.println(photoName2+", isPhotoSuffix="+isPhotoSuffix);
    }

}

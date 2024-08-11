package com.kq.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author kq
 * @date 2021-07-06 19:13
 * @since 2020-0630
 */
public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> tmpList = new ArrayList();
        Random r = new Random();
        for(int i=0;i<10;i++) {
            tmpList.add(r.nextInt(200));
        }

        System.out.println("original:"+tmpList);

        Collections.shuffle(tmpList);
        System.out.println("shuffle:"+tmpList);

        Collections.sort(tmpList);
        System.out.println("sort:"+tmpList);
    }

}

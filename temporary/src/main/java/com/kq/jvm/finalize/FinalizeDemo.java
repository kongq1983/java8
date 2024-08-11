package com.kq.jvm.finalize;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * FinalizeDemo
 *
 * @author kq
 * @date 2021/7/12 20:40
 * @since 1.0.0
 */
public class FinalizeDemo {

    static List<Object> list1 = new ArrayList<>();
    static AtomicLong atomicLong = new AtomicLong();

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (true) {

//            list.add(new User(i++, UUID.randomUUID().toString()));
//            new User(j--, UUID.randomUUID().toString());

            list.add(new User(i++, atomicLong.incrementAndGet()+""));
            new User(j--, atomicLong.incrementAndGet()+""); // 会触发finalize
        }
    }

}

package com.kq.autoclose;

import java.io.Closeable;
import java.io.IOException;

/**
 * MyAutoClose
 *
 * @author kq
 * @date 2021-12-29 22:32
 * @since 1.0.0
 */
public class MyAutoClose implements Closeable {

    public void print(){
        System.out.println("MyAutoClose.print");
    }


    @Override
    public void close() throws IOException {
        System.out.println("MyAutoClose");
    }
}

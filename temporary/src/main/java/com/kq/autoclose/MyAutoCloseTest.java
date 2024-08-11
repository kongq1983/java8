package com.kq.autoclose;

import java.io.IOException;

/**
 * MyAutoCloseTest
 *
 * @author kq
 * @date 2021-12-29 22:33
 * @since 1.0.0
 */
public class MyAutoCloseTest {

    public static void main(String[] args) throws IOException {

        try(MyAutoClose myAutoClose = new MyAutoClose()) {
            myAutoClose.print();

        }

    }

    //            if(myAutoClose!=null) throw  new IOException("eee");

}

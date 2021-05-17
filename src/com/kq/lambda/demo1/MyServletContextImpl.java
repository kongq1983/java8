package com.kq.lambda.demo1;

/**
 * @author kq
 * @date 2021-05-17 13:42
 * @since 2020-0630
 */
public class MyServletContextImpl implements ServletContext{

    @Override
    public String toString() {
        return "MyServletContextImpl = "+this.hashCode();
    }
}

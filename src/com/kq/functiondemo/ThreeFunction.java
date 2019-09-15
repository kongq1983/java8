package com.kq.functiondemo;

/**
 * Created by qikong on 2019/3/26.
 */

@FunctionalInterface
public interface ThreeFunction<T,U,K,R> {

    R apply(T t,U u,K k);

}

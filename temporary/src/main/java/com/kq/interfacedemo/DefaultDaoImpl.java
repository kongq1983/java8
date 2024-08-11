package com.kq.interfacedemo;

import sun.text.normalizer.ICUData;

/**
 * 只需要实现抽象方法
 * 不用实现default方法
 * Created by qikong on 2019/3/16.
 */
public class DefaultDaoImpl implements IDefaultDao{


    @Override
    public void run() {
        System.out.println("defaultDaoImpl run");
    }



//    @Override  静态方法不能够被覆写
    public static void staticMethod(){
        System.out.println("DefaultDaoImpl.staticMethod run it.");
    }


    public static void main(String[] args) {
        IDefaultDao dto = new DefaultDaoImpl();
        dto.run();

        dto.defaultMethod();

        //接口静态方法
        IDefaultDao.staticMethod();

    }


}

package com.kq.interfacedemo;

/**
 * Created by qikong on 2019/3/16.
 */
public interface IDefaultDaoChild  extends  IDefaultDao{

//    @Override  静态方法不能够继承
    public static void staticMethod(){
        System.out.println("IDefaultDao.staticMethod run it.");
    }

}

package com.kq.interfacedemo;

/**
 * Created by qikong on 2019/3/16.
 */
public interface IDefaultDao {

    /**
     * 实现类 必需实现
     */
    public void run();

    /**
     * static 修饰接口中的方法必须有主体
     * 接口的static方法只能被接口本身调用; 接口名.方法名
     * 接口的static方法不能够被子接口继承
     * 接口的static方法不能够被实现类覆写及直接调用
     */
    public static void staticMethod(){
        System.out.println("IDefaultDao.staticMethod run it.");
    }


    /**
     * 可被实现类覆盖
     */
    default void defaultMethod(){
        System.out.println("default method run it.");
    }

}

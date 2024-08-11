package com.kq.jvm.finalize;

/**
 * User
 *
 * @author kq
 * @date 2021/7/12 20:40
 * @since 1.0.0
 */
public class User {

    private int index;
    private String id;

    public User(int index, String id) {
        this.index = index;
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "index=" + index +
                ", id='" + id + '\'' +
                '}';
    }

    //User类需要重写finalize方法
    @Override
    protected void finalize() throws Throwable {
        FinalizeDemo.list1.add(this); // 这里把User对象给救活了
        System.out.println("关闭资源，userid=" + id + "即将被回收  list.size="+FinalizeDemo.list1.size());
    }

}

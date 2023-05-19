package com.kq.jvm.stringtable;


/**
 * @author kq
 * @date 2021-11-15 8:40
 * @since 2020-0630
 */
public class TestObject {

    private String a = "a";
    private String b = "b";
    private String c = a+b;
    private String s = "java-jvm";
    private String snew = new String("java-jvm");

    private String str;
    private String strinter;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStrinter() {
        return strinter;
    }

    public void setStrinter(String strinter) {
        this.strinter = strinter;
    }
}
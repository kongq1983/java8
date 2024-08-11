package stringtable;

import java.util.Random;

/**
 * StringDemo
 *
 * @author kq
 * @date 2021-11-15 18:58
 * @since 1.0.0
 */
public class StringDemo {

    private Random random = new Random();
    private String name = "java";
    private String newStr = new String("hello");
    private String randomStr = new String(random.nextInt(1)+"");

    String a = "a";
    String b = "b";
    String d = "a"+"b";
    String c = a+b;

    private String cintern;

    public String getCintern() {
        return cintern;
    }

    public void setCintern(String cintern) {
        this.cintern = cintern;
        System.out.println(d);
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}

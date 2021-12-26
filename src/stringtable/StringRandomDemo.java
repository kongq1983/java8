package stringtable;

import java.util.Random;

/**
 * stringtable.StringRandomDemo
 *
 * @author kq
 * @date 2021-11-15 21:26
 * @since 1.0.0
 */
public class StringRandomDemo {
    private Random random = new Random();
    private String randomStr = new String(random.nextInt(1)+"");

    public void print(){
        System.out.println(randomStr);
    }

}

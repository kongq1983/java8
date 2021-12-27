package stringtable;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * stringtable.StringDemo
 * stringtable.StringDemoMain
 *
 * @author kq
 * @date 2021-11-15 19:01
 * @since 1.0.0
 */
public class StringDemoMain {

    private StringDemo stringDemo = new StringDemo();

    public static void main(String[] args) throws Exception{
        StringDemo stringDemo1 = new StringDemo();
        stringDemo1.setCintern(stringDemo1.getC().intern());

        StringDemo stringDemo2 = new StringDemo();
        stringDemo2.setCintern(stringDemo2.getC().intern());

        String aa1 = "aa1";
        String bb1 = "bb1";

        String cc1 = aa1 +bb1;

        String dd1 = cc1.intern();

        StringRandomDemo randomDemo1 = new StringRandomDemo();
        StringRandomDemo randomDemo2 = new StringRandomDemo();

        randomDemo1.print();
        randomDemo2.print();

        StringABDemo ab1 = new StringABDemo();
        StringABDemo ab2 = new StringABDemo();

        ab1.print();
        ab2.print();

        System.out.println("cc1==dd1 , "+(cc1==dd1));

        Random random = new Random();
        for(int i=0;i<10;i++) {
            System.out.println(random.nextInt(1));

        }


        TimeUnit.MINUTES.sleep(600);


    }


}

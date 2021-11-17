package bytecode;

/**
 * @author kq
 * @date 2021-07-12 17:25
 * @since 2020-0630
 */
public class StringTest1 {

    public static void main(String[] args) {

        String TOGETHERPAYTYPE = "togetherpaytype:%s:%s";

        String s = String.format(TOGETHERPAYTYPE,"1");

        System.out.println(s);

    }

}

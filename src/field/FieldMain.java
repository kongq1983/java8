package field;

import java.util.concurrent.TimeUnit;

/**
 * FieldMain
 *
 * @author kq
 * @date 2021-11-18 23:40
 * @since 1.0.0
 */
public class FieldMain {

    A a = new A();
    B b = new B();
    C c = new C();

    public static void main(String[] args) throws Exception{
        FieldMain f = new FieldMain();
        f.a.toString();
        f.b.toString();
        f.b.toString();

        TimeUnit.MINUTES.sleep(600);

    }

}

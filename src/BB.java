/**
 * BB
 *
 * @author kq
 * @date 2021-11-07 22:06
 * @since 1.0.0
 */
public class BB {

    public static void main(String[] args) {
        String str = new StringBuilder("Hello").append("World").toString();
        boolean result = str == str.intern();
        System.out.println("str result :" + result);
    }

    public void anew(){
        String str = new String("hello1");
    }

    public void notnew(){
        String str = "hello2";
    }

    public void notnew2(){
        String str = new StringBuilder("Hello").append("World").toString();
    }

    public void notnew3(){

        String str = "a"+"b";
    }

    public void notnew4(){
        String a = "a";
        String b = "b";
        String str = a+b;
    }


}

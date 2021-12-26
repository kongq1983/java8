import java.lang.reflect.Method;

/**
 * MethodDemo
 *
 * @author kq
 * @date 2021-11-08 22:36
 * @since 1.0.0
 */
public class MethodDemo {

    private int i;
    private String name;

    private String getPrivateAddress(){
        return name;
    }

    protected String getProtectedAddress(){
        return name;
    }

    String getDefaultAddress(){
        return name;
    }


    public static void main(String[] args) {
//        Method[] methods = MethodDemo.class.getDeclaredMethods();

        MethodDemo.class.getMethods();

//        for(Method m : methods) {
//            System.out.println(m.getName());
//        }

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

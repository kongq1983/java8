package field;

/**
 * ClassForNameDemo
 *
 * @author kq
 * @date 2022-02-12 21:55
 * @since 1.0.0
 */
public class ClassForNameDemo {

    public static void main(String[] args) throws Exception{
        Class  aClass = Class.forName("field.A");
        Class  aClass1 = Class.forName("field.A");
        // class java.lang.Class
        Class aClass2 = A.class.getClass();

        A a = new A();

        Class aClass3 = a.getClass();

        System.out.println(aClass);
        System.out.println(aClass1);
        System.out.println(aClass2);
        System.out.println(aClass3);

        System.out.println(aClass.getClassLoader());
        System.out.println(aClass1.getClassLoader());
        // null
        System.out.println(aClass2.getClassLoader());
        System.out.println(aClass3.getClassLoader());
    }

}

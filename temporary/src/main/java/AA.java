import java.util.UUID;

/**
 * AA
 *
 * @author kq
 * @date 2021-11-04 0:10
 * @since 1.0.0
 */
public class AA {

    public static void main(String[] args) {
        String str = new StringBuilder("Hello").append("World").toString();
        boolean result = str == str.intern();
        System.out.println("str result :"+result);

//        String str1 = new StringBuilder("ja").append("va").toString();
//        System.out.println(str1==str1.intern());
//
//        String s = "zhe";
//        String s2 = "jiang";
//
//        // "zhejiang在常量池不存在"
//        String s3 = s+s2;
//
//        System.out.println(s3==s3.intern()); // true

        AA.class.getDeclaredFields();


        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().replaceAll("-","").toUpperCase());

        System.out.println("ZYZH666888B65BE96B7B076E25E92E7E".length());

    }

}

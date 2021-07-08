package sanzi;

/**
 * SanziTest
 *
 * @author kq
 * @date 2021/7/8 23:39
 * @since 1.0.0
 */
public class SanziTest {

    /**
     * 不考虑112  121  211 这种 有7776种
     * @param args
     */
    public static void main(String[] args) {
        int index = 1;
        String str = "%s%s%s%s%s";
        for(int i=1;i<=6;i++) {
            for(int i1=1;i1<=6;i1++) {
                for(int i2=1;i2<=6;i2++) {
                    for(int i3=1;i3<=6;i3++) {
                        for(int i4=1;i4<=6;i4++) {

                            String s = String.format(str,i,i1,i2,i3,i4);
                                System.out.println((index++)+","+s);

                        }
                    }
                }
            }
        }
    }


}

package sanzi;

import java.util.*;

/**
 * 两个散子
 * SanziTest
 *
 * @author kq
 * @date 2021/7/8 23:39
 * @since 1.0.0
 */
public class ThreeSanziQuChongTest {

    /**
     * 不考虑112  121  211 这种 有7776种
     * @param args
     */
    public static void main(String[] args) {
        int index = 1;
        String str = "%s%s%s%s%s";
        Set<String> set = new TreeSet<>();
        for(int i=1;i<=6;i++) {
            for(int i1=1;i1<=6;i1++) {
                for(int i2=1;i2<=6;i2++) {
                    String s = dealStr(i, i1, i2);
                    set.add(s);
                }

            }
        }

        for(String s : set) {
            System.out.println((index++)+","+s);
        }

    }


    public static String dealStr(int i,int i1,int i2){
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(i1);
        list.add(i2);

        Collections.sort(list);

        StringBuilder str = new StringBuilder();

        for(Integer s: list){
            str.append(s);
        }

        return str.toString();

    }

}

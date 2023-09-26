package cycle;

/**
 * NotMainStaticCycle
 *
 * @author kq
 * @date 2022-03-13 14:40
 * @since 1.0.0
 */
public class NotMainStaticCycle {

    public static int num = 0;

    public static void add(int i,int b) {
        num++;
        add(i,b);
    }

    public static void main(String[] args) {

        try{
            System.out.println("num="+num);
            add(10,20);

        }catch (StackOverflowError error) {
            System.out.println("error: num="+num);
            add(10,20);

        }

    }

}

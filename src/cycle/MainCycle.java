package cycle;

/**
 * MainCycle
 *
 * @author kq
 * @date 2022-03-13 14:24
 * @since 1.0.0
 */
public class MainCycle {

    public static int num = 0;

    public static void main(String[] args) {

        try{
            System.out.println("-------------"+num++);
            main(args);
        }catch (StackOverflowError error) {
            System.out.println("e:-------------"+num++);
            main(args);

        }

    }

}

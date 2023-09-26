package cycle;

/**
 * NotMainCycle
 *
 * @author kq
 * @date 2022-03-13 14:30
 * @since 1.0.0
 */
public class NotMainCycle {

    public void add(int i,int b) {
        add(i,b);
    }

    public static void main(String[] args) {
        new NotMainCycle().add(10,20);
    }
}

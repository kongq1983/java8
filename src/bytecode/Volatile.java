package bytecode;

/**
 * @author kq
 * @date 2021-01-30 8:54
 * @since 2020-0630
 */
public class Volatile {

    private boolean start;
    private volatile boolean stop;
    private int size = 10;
    private int MAX = 100;

    public void start() {
        while(start) {

        }
    }

    public void stop() {
        while(stop) {

        }
    }

    public int getSize1(int a,int b){
        int result = a +b+ 10;
        return result;

    }

    public static int getStaticSize(int a,int b){
        int result = a +b+ 10;
        return result;

    }


    public int add(int a){
        int result = a +size+ 10 + MAX;
        return result;

    }

}

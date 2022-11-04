package lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kq
 * @date 2022-11-03 16:50
 * @since 2020-0630
 */
public class IntStreamDemo {

    public static void main(String[] args) {
        simple();
        System.out.println("start map-demo");
        map();
        System.out.println("e-n-d map-demo");

        System.out.println("start flatmap-demo");
        flatMap();
        System.out.println("e-n-d flatmap-demo");

        System.out.println("start filter-demo");
        filter();
        System.out.println("e-n-d filter-demo");


        System.out.println("start of-demo");
        of();
        System.out.println("e-n-d of-demo");
    }

    public static void main1(String[] args) {

        IntStream intStream = IntStream.range(1, 10);
//        intStream.forEach(System.out::println);  // 不注释，下面使用，会报stream has already been operated upon or closed

        System.out.println("---------------------------------");

        Stream<String> stream = intStream.mapToObj(num-> Integer.toBinaryString(num));

        stream.forEach(System.out::println);

        IntStream int1Stream = IntStream.range(50, 60);

        Stream<MyObject> stream1 = int1Stream.mapToObj(num-> {
            MyObject myObject = new MyObject(num);
            return myObject;
        });

        System.out.println("---------------------------------");

        stream1.forEach(System.out::println);

        // 注意range:前面1个数包括  后面1个数不包括
        IntStream intStream2 = IntStream.range(1, 5); // 1 2 3 4 5
//        int sum = intStream2.reduce(0, Integer::sum); //
        int sum = intStream2.reduce(0, Integer::sum); //
        System.out.println("sum="+sum);


//        IntStream intStream3 = IntStream.range(0, 0); // 1 2 3 4 5
        IntStream intStream3 = IntStream.range(1, 5); // 1 2 3 4 5
        OptionalInt sumOptional = intStream3.reduce(Integer::sum);

        int sum1 = 0;
        try {
            // 这回会报错  IntStream.range(0, 0)
            sum1 = sumOptional.getAsInt();
            System.out.println("first sum1=" + sum1);
        }catch (Exception e) {
            sum1 = sumOptional.orElse(0);
            System.out.println("second sum1="+sum1);
        }


    }

    public static void simple(){

        // 左闭-右开
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::println);

    }

    public static void map(){

        // 左闭-右开
        IntStream intStream = IntStream.range(1, 10);
        // n*n
        intStream.map(e->e*e).forEach(System.out::println);

    }

    public static void flatMap(){

        // 左闭-右开
        IntStream intStream = IntStream.range(1, 10);
        // n*n
        intStream.flatMap(v->IntStream.of(v*v)).forEach(System.out::println);

    }

    public static void filter(){

        // 左闭-右开
        IntStream intStream = IntStream.range(1, 10);
        // n*n
        intStream.filter(e->e%2==0).forEach(System.out::println);

    }

    public static void of(){
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        intStream.forEach(System.out::println);
    }

    // of
    // IntStream intStream1 = IntStream.of(20, 40, 60, 80, 100, 120, 140);

}

package lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kq
 * @date 2022-11-03 16:50
 * @since 2020-0630
 */
public class IntStreamDemo {

    public static void main(String[] args) {

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
    }


}

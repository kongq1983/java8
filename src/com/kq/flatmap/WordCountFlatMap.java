package com.kq.flatmap;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Created by qikong on 2020/10/27.
 */
public class WordCountFlatMap {


    public static void main(String[] args) {

//        System.out.println(WordCountFlatMap.class.getClassLoader().getResource("data.txt"));
//        System.out.println(WordCountFlatMap.class.getResource("data.txt"));
//        WordCountFlatMap.class.getResource()

        // 总共有多少个单词 去重
        long uniqueWords = 0;

//        path = Paths.get(Main.class.getClassLoader().getResource("test.txt").toURI());
        try(Stream<String> lines = Files.lines(Paths.get(WordCountFlatMap.class.getResource("data.txt").toURI()), Charset.defaultCharset())){

            uniqueWords = lines.flatMap(line-> Arrays.stream(line.split(" "))).distinct().count();

        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(uniqueWords);

        //统计每个单词出现的数量
        Map<String, AtomicInteger> wordCountMap = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get(WordCountFlatMap.class.getResource("data.txt").toURI()), Charset.defaultCharset())){

//            wordCountMap.computeIfPresent()
//            lines.flatMap(line-> Arrays.stream(line.split(" "))).forEach(System.out::println);
            lines.flatMap(line-> Arrays.stream(line.split(" "))).forEach(key->{
                wordCountMap.computeIfAbsent(key,(k)->new AtomicInteger(0)).incrementAndGet();
            });

            for(Map.Entry<String,AtomicInteger> kv : wordCountMap.entrySet()) {
                System.out.println("key="+kv.getKey()+", value="+kv.getValue().get());
            }



        }catch (Exception e) {
            e.printStackTrace();
        }


    }


}

package com.kq.mydemo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kq
 * @date 2020-11-10 8:42
 * @since 2020-0630
 */
public class BaiJiaXingDemo {

    public static void main(String[] args) throws Exception{

        try (
                Stream<String> stream = Files.lines(Paths.get(BaiJiaXingDemo.class.getResource("xing").toURI()));
                Stream<String> name1Stream = Files.lines(Paths.get(BaiJiaXingDemo.class.getResource("name1").toURI()));
                ){

            Function<String,String[]> splitStr = (line) -> {

                if(line==null||line.trim().length()==0) {
                    return new String[0];
                }
                String[] strs = new String[line.length()];
                line = line.trim();
                for(int i=0;i<line.length();i++) {
                    line = line.replaceAll(" ","");
                    if(i<line.length()-1) {
                        strs[i] = line.substring(i, i + 1);
                    }
                }

                return strs;
            };

            Predicate<String> predicate = p-> {
                if(p!=null && p.matches("[^,，。. ]{1}")) {
                    return true;
                }
                return false;
            };

//            stream.flatMap(line -> Stream)
            // 拆成单个字，然后过滤特殊符号
            List<String> list = stream.flatMap(line -> Arrays.stream(splitStr.apply(line))).filter(s-> predicate.test(s)).distinct().collect(Collectors.toList());
            List<String> name1List = name1Stream.flatMap(line -> Arrays.stream(splitStr.apply(line))).filter(s-> predicate.test(s)).distinct().collect(Collectors.toList());
//            List<String> list = stream.flatMap(line -> Arrays.stream(line.split("，"))).collect(Collectors.toList());
//            List<String> list = stream.flatMap(line -> Arrays.stream(line.split("，"))).collect(Collectors.toList());

//            List<String> list = stream.distinct().collect(Collectors.toList());
//            System.out.println("总大小 list.size="+list.size());
//            list.forEach(System.out::println);
            System.out.println("总大小 name1List.size="+name1List.size());
            name1List.forEach(System.out::println);

            generateName(list,name1List,name1List);

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private static void generateName(List<String> name0List,List<String> name1List,List<String> name2List){

        int name0Size = name0List.size();
        int name1Size = name1List.size();
        int name2Size = name2List.size();

        long size = 0;

        for(int i=0;i<name0Size;i++) {
            String name0 = name0List.get(i);

            //生成2个名字
            for(int j=0;j<name1Size;j++) {
                String name1 = name1List.get(i);
                System.out.println(size+":"+name0+name1);
                size++;
            }

            //生成2个名字
            for(int j=0;j<name1Size;j++) {
                String name1 = name1List.get(i);

                for(int k=0;k<name2Size;k++) {
                    String name2 = name2List.get(k);
                    System.out.println(size+":"+name0+name1+name2);
                    size++;
                }

            }

        }


    }


    public static void main1(String[] args) {
        boolean result = "a".matches("^[,，。.]{1}");
        System.out.println(result);
    }

}

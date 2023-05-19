package com.kq.regex;

import java.util.*;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kq
 * @date 2022-12-15 15:57
 * @since 2020-0630
 */
public class RegexDemo {


    public static void main(String[] args) {

        String str = "您好！系统还未收到{{name.DATA}}今日的健康上报信息! {{good.DATA}  请填写地址: {{address.DATA}} ! 你的爱好: {{hobby.DATA}}  {{1user.DATA}}  {{user1.DATA}}";
//        String str = "您好！系统还未收到{{name.DATA}}今日的健康上报信息! ";
        parse(str);

        Set<String> set = regexWechatParam(str);

        System.out.println("==================================================");

        set.forEach(e-> System.out.println(e));

    }


//    当此字符紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}）之后时，匹配模式是"非贪心的"
//    "非贪心的"模式匹配搜索到的、尽可能短的字符串，
//    而默认的"贪心的"模式匹配搜索到的、尽可能长的字符串。
//    例如，在字符串"oooo"中，"o+?"只匹配单个"o"，而"o+"匹配所有"o"


//    ^[A-Za-z]+$　　//匹配由26个英文字母组成的字符串
//            ^[A-Z]+$　　//匹配由26个英文字母的大写组成的字符串
//            ^[a-z]+$　　//匹配由26个英文字母的小写组成的字符串
//            ^[A-Za-z0-9]+$　　//匹配由数字和26个英文字母组成的字符串
//            ^\w+$　　//匹配由数字、26个英文字母或者下划线组成的字符串


//    在Java的正则表达式中，通过在修饰匹配次数的符号后面加一个?，即非贪婪模式，默认情况下是贪婪模式

    // d 数字字符匹配。等效于 [0-9]
    // 非数字字符匹配。等效于 [^0-9]
    public static void parse(String str) {

//        String pattern = "((\\{\\{)(\\D+.DATA)(}}))?";
//        String pattern = "(\\{\\{)(\\D+.DATA)(}})?";

//        String pattern = "(\\{\\{[A-Za-z0-9]+.DATA\\}\\})";

//        String pattern = "(\\{\\{)([A-Za-z]+.DATA)(}})";
        String pattern = "(\\{\\{)([A-Za-z0-9]+.DATA)(}})";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(str);

        while(m.find()) {
            System.out.println("Found value 0: " + m.group(0) ); // 正则匹配字符串 以这个为例： {{name.DATA}}
            System.out.println("Found value 1: " + m.group(1) ); // 匹配第1个组  {{
            System.out.println("Found value 2: " + m.group(2) ); // 匹配第2个组  name.DATA
            System.out.println("Found value 3: " + m.group(3) ); // 匹配第3个组  }}

            String paramCode = m.group(2).replaceAll(".DATA",""); // name
            System.out.println("found paramCode="+paramCode);
        }

//        if (m.find( )) {
//            System.out.println("Found value 0: " + m.group(0) );
//            System.out.println("Found value 1: " + m.group(1) );
//            System.out.println("Found value 2: " + m.group(2) );
//            System.out.println("Found value 3: " + m.group(3) );
//        } else {
//            System.out.println("NO MATCH");
//        }

    }


    public static Set<String> regexWechatParam(String content) {
//        String reg = "(?<=\\{\\{).*?(?=.DATA\\}\\})";//定义正则表达式
        String reg = "(\\{\\{)([A-Za-z]+.DATA)(}})";//定义正则表达式
        Pattern patten = Pattern.compile(reg);//编译正则表达式
        Matcher matcher = patten.matcher(content);// 指定要匹配的字符串
        List<String> matchStrs = new ArrayList<>();
        while (matcher.find()) { //此处find（）每次被调用后，会偏移到下一个匹配
            System.out.println("--- "+matcher.group());
            matchStrs.add(matcher.group());//获取当前匹配的值  // 得到匹配的字符串  {{hobby.DATA}}
        }
        return new LinkedHashSet<>(matchStrs);
    }


}

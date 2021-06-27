package com.kq.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kq
 * @date 2021-05-29 16:28
 * @since 2020-0630
 */
public class MatchFileterTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("t_order");
        list.add("t_order_202101");
        list.add("t_order_202103");
        list.add("t_order_202102");
        list.add("t_order_detail_202106");
        list.add("t_order_detail_202103");
        list.add("t_order_detail_202101");
        String realTablePrefix = "t_order";
        String realTablePrefixd = "t_order_detail";

        List<String> matchTables = list.stream().filter(s-> s.matches(realTablePrefix+"_(\\d){6}")).sorted().collect(Collectors.toList());
        List<String> matchTables1 = list.stream().filter(s-> s.matches(realTablePrefixd+"_(\\d){6}")).sorted().collect(Collectors.toList());

        System.out.println(matchTables);
        System.out.println(matchTables1);

    }

}

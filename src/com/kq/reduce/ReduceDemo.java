package com.kq.reduce;

import com.kq.data.NumberData;

import java.util.List;
import java.util.Optional;

/**
 * Created by qikong on 2019/3/18.
 */
public class ReduceDemo {

    public static void main(String[] args) {

        int sum = 0;

        List<Integer> numberList = NumberData.getIntegerLists(100);
        // demo1
        for(int num : numberList)
            sum+=num;

        System.out.println("sum="+sum);

        // demo2
        sum = numberList.stream().reduce(0,Integer::sum);

        System.out.println("sum="+sum);

        //demo3
        Optional<Integer> sumOptional = numberList.stream().reduce((a, b)->(a+b));
        System.out.println("sum="+sumOptional.get());

        //demo4
        sum = numberList.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum="+sum);




    }

}

package com.kq.functiondemo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 1个参数Function:
 * Function<Integer,Integer> f1 = (x) -> Math.pow(x,2);
 * 两个参数的函数是BiFunction
 * BiFunction<Integer, Integer, Integer> f3 = (x, y) -> x + y;
 * 不接受参数的函数是Supplier
 * Supplier<Double> f4 = Math::random;
 */
public class FunctionMoreParamDemo {

    public static boolean isOk(String str,int type) {

        if(type==1){
            return true;
        }

        return str.endsWith("00000");

    }


    public static void main(String[] args) {
        BiFunction<String,Integer,Boolean> isOkF = FunctionMoreParamDemo::isOk;
        boolean result0 = isOkF.apply("100000",0);

        boolean result1 = isOkF.apply("0001",1);

        assert result0==result1;

        //无参
        Supplier<Double> fr = Math::random;
        double random = fr.get();
        System.out.println("random="+random);

        Function<String,Boolean> endWith = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                return s.endsWith("00000");
            }
        };


        Boolean isOK = endWith.apply("1000000");
        System.out.println("isOK="+isOK);
        assert isOK==false;

    }

}

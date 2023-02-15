package com.dongguo.lambda;

import java.util.function.Function;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
public class lambdaDemo3 {
    public static <R> R typeConver(Function<String, R> function) {
        String str = "1235";
        R result = function.apply(str);
        return result;
    }

    public static void main(String[] args) {
        //匿名内部类
        Integer conver = typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println(conver);

        //lambda
        Integer conver1 = typeConver((str) -> {
            return Integer.valueOf(str);
        });
        System.out.println(conver1);
    }
}

package com.dongguo.lambda;

import java.util.function.IntPredicate;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
public class LambdaDemo2 {
    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i:arr){
            if (predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //匿名内部类
        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value > 5;
            }
        });

        //lambda
        printNum((value)->{
           return value > 5;
        });
    }
}

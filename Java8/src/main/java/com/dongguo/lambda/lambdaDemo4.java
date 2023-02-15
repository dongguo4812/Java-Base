package com.dongguo.lambda;

import java.util.function.IntConsumer;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
public class lambdaDemo4 {
    public static void foreachArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            consumer.accept(i);
        }
    }

    public static void main(String[] args) {
        //匿名内部类
        foreachArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });

        //lambda
        foreachArr(value -> System.out.println(value));
    }
}

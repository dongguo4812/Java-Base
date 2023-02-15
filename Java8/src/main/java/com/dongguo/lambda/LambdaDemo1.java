package com.dongguo.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
public class LambdaDemo1 {

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void main(String[] args) {
        //匿名内部类
        int num = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(num);

        //lambda
        int num1 = calculateNum((a, b) -> {
            return a + b;
        });
        System.out.println(num1);
    }
}

package com.dongguo.top;

/**
 * @author dongguo
 * @date 2023/1/31
 * @description:
 */
public class RecursionTest {


    public static void main(String[] args) {
        int sum = getSum(10);
        System.out.println(sum);
        int sum1 = getSum1(10);
        System.out.println(sum1);
        int sum2 = getSum2(10);
        System.out.println(sum2);
        int sum3 = getSum3(10);
        System.out.println(sum3);
    }

    /**
     * for循环求和
     * @param n
     * @return
     */
    public static int getSum(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum += x;
        }
        return sum;
    }

    /**
     * 递归求和
     * @param n
     * @return
     */
    public static int getSum1(int n) {
        if (n == 1){
            return 1;
        }else {
          return n + getSum1(n-1);
        }
    }

    /**
     * for循环求积
     * @param n
     * @return
     */
    public static int getSum2(int n) {
        int sum = 1;
        for (int x = 1; x <= n; x++) {
            sum *= x;
        }
        return sum;
    }

    /**
     * 递归求积
     * @param n
     * @return
     */
    public static int getSum3(int n) {
        if (n == 1){
            return 1;
        }else {
            return n * getSum3(n-1);
        }
    }
}

package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/27
 * @description:
 */
public class NarcissisticNumber {
    /**
     * 水仙花数是一个三位数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        for (int i = 100; i <= 999; i++) {
            int  one = i % 10;
            int  ten = (i / 10) % 10;
            int  hundred = i / 100;
            if (one*one*one+ten*ten*ten+hundred*hundred*hundred == i){
                num+=1;
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}

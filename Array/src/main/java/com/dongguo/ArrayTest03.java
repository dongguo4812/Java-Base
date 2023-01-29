package com.dongguo;

import java.util.Random;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] ids = new int[10];
        //1赋值
        Random random = new Random();
        for (int i = 0; i < ids.length; i++) {
            ids[i] = random.nextInt(90) + 10;
            System.out.print(ids[i] + "\t");
        }
        System.out.println();
        //2求最大值
        int max = ids[0];
        //3求最小值
        int min = ids[0];
        //4求总和
        int total = 0;
        //5求平均数
        int avg = 0;
        for (int i = 1; i < ids.length; i++) {
            if (ids[i] > max) {
                max = ids[i];
            }
            if (ids[i] < min) {
                min = ids[i];
            }
            total += ids[i];
        }
        avg = total / ids.length;
        System.out.println("最大值" + max);
        System.out.println("最小值" + min);
        System.out.println("总和" + total);
        System.out.println("平均数" + avg);
    }
}

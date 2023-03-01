package com.dongguo;

import java.util.Scanner;

/**
 * @author dongguo
 * @date 2023/2/28
 * @description:
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//封装标准输入流
        int i = sc.nextInt();               //读取整数
        double j = sc.nextDouble();         //读取浮点数
        double x = i * j; //计算乘积
        System.out.println("i*j=" + x);
    }
}

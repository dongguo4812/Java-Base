package com.dongguo;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author dongguo
 * @date 2023/2/16
 * @description:
 */
public class JavaTest {
    public static final String NATION = "中国";

    @Test
    public void test() {

        int num = 10;
        System.out.println(num);
    }

    @Test
    public void test1() {
        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);
    }

    @Test
    public void test2() {
        double pow = Math.pow(3, 2);
        System.out.println(pow);
    }

    @Test
    public void test3() {
        double x = 9.98;
        long round = Math.round(x);
        int i = (int) round;
        System.out.println(i);
    }
    public static void main(String[] args) {
        //创建Scanner类型变量
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();//变量.功能名称（）接收键盘输入整数
        System.out.println(i);
        String s=sc.next();//接受键盘输入的字符串
        System.out.println(s);

    }
    @Test
    public void test4() {
        BigInteger value = BigInteger.valueOf(100);
        System.out.println(value);
    }
}

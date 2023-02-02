package com.dongguo.top;

import java.util.Arrays;

/**
 * @author dongguo
 * @date 2023/1/30
 * @description: 可变个数的形参
 */
public class VarargsTest {
    public static void show(String s) {
        System.out.println(s);
    }

    public static void show(String... strings) {
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        show("张三");
        show("张三","李四","王五");
    }

}

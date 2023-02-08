package com.dongguo.string01;

/**
 * @author dongguo
 * @date 2023/2/7
 * @description:
 */
public class StringTest {
    public static void main(String[] args) {
        /**
         * @Author Dongguo
         * @Date 2018/1/6 10:03
         * @Description: str1和str2的区别
         * str1在内存中只有一个对象
         * str2在内存中有两个对象
         */
        String str1 = "abc"; //在方法区字符串常量池中创建了一个abc字符串，并把地址赋值给s，产生了一个对象
        String str2 = new String("abc");// 创建2个对象   new一个字符串对象在堆内存中，并在常量池中创建abc（字符串在常量池中，没有则创建，有则不创建）
        System.out.println(str1 == str2);//false  地址不一样
        System.out.println(str1.equals(str2));//true  String类中的equals复写了Object中的equals 比较字符串的内容是否相同

        System.out.println("-----------------------");

        String s1 = "abcd";
        String s2 = "abcd";
        System.out.println(s1 == s2);//true
        //字符串在常量池中，没有则创建，有则不创建

    }
}

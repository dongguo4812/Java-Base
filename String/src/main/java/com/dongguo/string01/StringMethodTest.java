package com.dongguo.string01;

/**
 * @author dongguo
 * @date 2023/2/7
 * @description:
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String str = "abcdcba";
        int len = str.length();
        char ch = str.charAt(0);
        int index = str.indexOf('a');
        int lastIndex = str.lastIndexOf('a');
        System.out.println(len);//7
        System.out.println(ch);//a
        System.out.println(index);//0
        System.out.println(lastIndex);//6
    }
}

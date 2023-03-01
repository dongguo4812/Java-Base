package com.dongguo;

/**
 * @author dongguo
 * @date 2023/3/1
 * @description:
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int a = 2;

        switch (a){
            case 1:
                System.out.println("1");
            default:
                System.out.println("0");
            case 2:
                System.out.println("2");
        }
    }
}

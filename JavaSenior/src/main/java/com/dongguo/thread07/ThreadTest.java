package com.dongguo.thread07;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        Window window = new Window();

        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}

package com.dongguo.thread04;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
    }
}

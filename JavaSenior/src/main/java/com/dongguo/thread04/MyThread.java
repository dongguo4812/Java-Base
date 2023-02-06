package com.dongguo.thread04;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

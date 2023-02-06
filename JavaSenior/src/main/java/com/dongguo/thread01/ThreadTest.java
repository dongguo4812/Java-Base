package com.dongguo.thread01;

/**
 * @author dongguo
 * @date 2023/2/2
 * @description: 多线程的创建之继承Thread
 * 实现遍历[0,100)以内的偶数
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+".."+i);
            }
        }
    }
}

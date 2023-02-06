package com.dongguo.thread07;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class Window implements Runnable {
    private int ticket = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "还剩" + ticket + "张票");
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

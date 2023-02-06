package com.dongguo.thread03;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                ticket--;
                System.out.println((Thread.currentThread().getName() + "售票成功，剩余:" + ticket + "张票"));
            }else {
                return;
            }
        }
    }
}

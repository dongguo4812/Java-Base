package com.dongguo.thread06;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class Window implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Window.class){
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println((Thread.currentThread().getName() + "售票成功，剩余:" + ticket + "张票"));
                } else {
                    break;
                }
            }

        }
    }
}

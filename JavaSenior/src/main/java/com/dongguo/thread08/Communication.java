package com.dongguo.thread08;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class Communication implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (Communication.class) {
                Communication.class.notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() +" ---"+ num);
                    num++;
                    try {
                        Communication.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

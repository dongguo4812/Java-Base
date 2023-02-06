package com.dongguo.thread01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author dongguo
 * @date 2023/2/2
 *
 * @description:
 */
@Slf4j
public class MainTest {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        threadTest.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+".."+i);
            }
        }
    }
}

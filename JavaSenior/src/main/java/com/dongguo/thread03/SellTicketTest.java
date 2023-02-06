package com.dongguo.thread03;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class SellTicketTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Window window = new Window();
            window.start();
        }
    }
}

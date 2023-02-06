package com.dongguo.thread06;

/**
 * @author dongguo
 * @date 2023/2/5
 * @description:
 */
public class SellTicketTest {
    public static void main(String[] args) {

        Window window = new Window();
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();

    }
}

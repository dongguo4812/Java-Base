package com.dongguo.thread08;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Communication communication = new Communication();
        new Thread(communication).start();

        new Thread(communication).start();
    }
}

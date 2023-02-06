package com.dongguo.thread09;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class ThreadTest {
    public static void main(String[] args) {

        try {
            NumThread numThread = new NumThread();
            FutureTask task = new FutureTask(numThread);
            new Thread(task).start();
            Object o = task.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

package com.dongguo.thread09;

import java.util.concurrent.Callable;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        return 100;
    }
}

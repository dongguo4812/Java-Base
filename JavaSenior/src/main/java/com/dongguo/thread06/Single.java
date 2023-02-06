package com.dongguo.thread06;

/**
 * @author dongguo
 * @date 2023/2/6
 * @description:
 */
public class Single {
    private static Single single = null;

    public Single() {
    }

    public static Single getInstance(){
        synchronized (Single.class){
            if (single != null){
                single = new Single();
            }
            return single;
        }

    }
}

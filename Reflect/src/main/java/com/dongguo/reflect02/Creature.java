package com.dongguo.reflect02;

import java.io.Serializable;

/**
 * @author dongguo
 * @date 2023/2/13
 * @description:
 */
public class Creature<T> implements Serializable {
    private static final long serialVersionUID = -4215371823149841670L;
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物进食");
    }
}

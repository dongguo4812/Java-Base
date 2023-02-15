package com.dongguo.java9;

import org.junit.jupiter.api.Test;

/**
 * @author dongguo
 * @date 2023/2/15
 * @description:
 */
public class JavaTest {
    @Test
    public void test() {
        Comparable<Object> com = new Comparable<>() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

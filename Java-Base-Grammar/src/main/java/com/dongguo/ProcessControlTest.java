package com.dongguo;

import org.junit.jupiter.api.Test;

/**
 * @author dongguo
 * @date 2023/2/28
 * @description:
 */
public class ProcessControlTest {
    /**
     * 案例1：成年人心率的正常范围是每分钟60~100次，体检时，
     * 如果心率不在此范围内，则提示需要做进一步的检查
     */
    @Test
    public void test1() {
        int heartRate = 180;
        if (60 <= heartRate && heartRate <= 100) {
            System.out.println("心率正常");
        } else {
            System.out.println("心率异常，需要做进一步检查");
        }
    }
}

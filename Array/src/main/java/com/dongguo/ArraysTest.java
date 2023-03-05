package com.dongguo;

import java.util.Arrays;

/**
 * @author dongguo
 * @date 2023/3/4
 * @description:
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);
    }
}

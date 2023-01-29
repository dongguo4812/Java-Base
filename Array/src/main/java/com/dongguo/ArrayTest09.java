package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        int[] arr = {9, 12, 15, 24, 36, 41, 59, 68};
        int i = 59;
        int index = binarySearch(arr, i);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int i) {
        int head = 0;
        int end = arr.length - 1;
        int mid = (head + end) >> 1;
        while (arr[mid] != i) {
            if (arr[mid] < i) {
                head = mid + 1;
            } else if (arr[mid] > i) {
                end = mid - 1;
            }
            if (head > end) {
                return -1;
            }
            mid = (head + end) >> 1;
        }
        return mid;
    }
}

package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr = {9, 12, 15, 24, 36, 41, 59, 68};
        int i = 59;
        int index = binarySearch(arr, i);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int i) {
        int head = 0;
        int end = arr.length - 1;
        while (head <= end) {
            int mid = (head + end) >> 1;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] < i) {
                head = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

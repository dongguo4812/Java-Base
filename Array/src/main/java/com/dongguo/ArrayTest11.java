package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 2, 7, 6, 4};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }

    /**
     * 遍历
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + "\t");
        }
        System.out.println();
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
}

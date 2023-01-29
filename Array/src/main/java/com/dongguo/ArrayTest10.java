package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 2, 7, 6, 4};
        printArray(arr);
        bubbleSort(arr);
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
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - 1 - x; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }
}

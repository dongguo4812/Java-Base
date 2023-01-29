package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        String[] arr = new String[]{"张三", "李四", "王五", "赵六"};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

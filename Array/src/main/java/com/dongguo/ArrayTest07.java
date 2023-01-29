package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        String[] arr = new String[]{"张三", "李四", "王五", "赵六"};
        String str = "王五";
        int index = getIndex(arr, str);
        System.out.println(index);
    }

    private static int getIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}

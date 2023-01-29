package com.dongguo;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        String[] arr = new String[]{"张三","李四","王五","赵六"};
        String[] copyArr = new String[arr.length];
        for (int i=0;  i<arr.length; i++){
            copyArr[i] = arr[i];
            System.out.print(copyArr[i] + "\t");
        }
    }
}

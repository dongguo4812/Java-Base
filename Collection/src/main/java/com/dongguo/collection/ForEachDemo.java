package com.dongguo.collection;

/**
 * JDK1.5新特性 增强for循环
 * JDK1.5版本后 出现新的接口 java.lang.iterable
 * Collection于是继承Iterable
 * Iterable作用就是实现增强for循环
 * 格式：
 * for（数据类型 变量名：数组或集合）{}
 * sout（变量）
 */

public class ForEachDemo {
    public static void main(String[] args) {
        function1();
    }

    private static void function1() {
        //for对于对象数组遍历的时候，能否调用对象的方法呢  可以
        String[] str = {"aaa", "bbb", "ccc"};
        for (String s : str) {
            System.out.println(s);
        }
    }

    /*
    实现增强for循环，遍历数组
    好处 代码少了 方便对容器遍历
    弊端 没有索引 不能操作容器里的元素
     */
    private static void function() {
        int[] arr = {7, 4, 1, 8, 5};
        for (int i : arr) {
            System.out.println(i + 1);
            //弊端i+1  结果输出值+1但arr中的元素不改变
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}

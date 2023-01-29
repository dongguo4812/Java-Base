package com.dongguo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sort {
    private static long startTime;
    private static long endTime;

    // 清空数组
    public static void clearArray(int[] array) {
        Arrays.fill(array, 0);
    }

    // 打印数组
    public static void printArray(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public static void printArray(double[] array) {
        System.out.print(Arrays.toString(array));
    }

    // 插入排序
    public static void insertSort(int[] array) {
        startTime = new Date().getTime();
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 冒泡排序
    public static void bubbleSort(int[] array) {
        startTime = new Date().getTime();
        for (int j = array.length - 1; j >= 0; --j) {
            for (int i = 0; i < j; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 简单选择排序
    public static void selectSort(int[] array) {
        startTime = new Date().getTime();
        for (int i = 0; i < array.length; ++i) {
            int min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; ++j) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 希尔排序
    public static void shellSort(int[] array) {
        startTime = new Date().getTime();
        int d = array.length;
        while (true) {
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < array.length; i = i + d) {
                    int temp = array[i];
                    int j;
                    for (j = i - d; j >= 0 && array[j] > temp; j = j - d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 希尔排序2
    public static void shellSortTwo(int[] array) {
        startTime = new Date().getTime();
        int s = array.length;
        for (int d = s; d > 0; d /= 2) {
            for (int i = 0; i < d; ++i) {
                int temp = array[i];
                for (int j = i + d; j < s; j += d) {
                    for (int k = j; k - d >= 0; k -= d) {
                        if (array[k] >= array[k - d]) {
                            break;
                        } else {
                            temp = array[k - d];
                            array[k - d] = array[k];
                            array[k] = temp;
                        }
                    }
                }

            }
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 快速排序
    public static void quickSort(int[] array, int start, int end) {
        if (start == 0 && end == array.length - 1)
            startTime = new Date().getTime();
        if (start < end) {
            int partitionIndex = quickSortPartition(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
        if (start == 0 && end == array.length - 1) {
            endTime = new Date().getTime();
            System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        }
    }

    // 划分数组
    public static int quickSortPartition(int[] array, int start, int end) {
        int partition = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && array[j] >= partition) {
                --j;
            }
            if (i < j) {
                array[i++] = array[j];
            }
            while ((i < j) && array[i] <= partition) {
                ++i;
            }
            if (i < j) {
                array[j--] = array[i];
            }
        }
        array[i] = partition;
        return i;
    }

    // 快速排序2
    public static void quickSortTwo(int[] array, int start, int end) {
        if (start == 0 && end == array.length - 1)
            startTime = new Date().getTime();
        if (start < end) {
            int partitionIndex = quickSortPartitionTwo(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
        if (start == 0 && end == array.length - 1) {
            endTime = new Date().getTime();
            System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        }
    }

    // 划分数组2
    public static int quickSortPartitionTwo(int[] array, int start, int end) {
        int partition = array[end];
        int i = start;
        int j = i;
        int temp;
        while (j < end) {
            if (array[j] < partition) {
                temp = array[i + 1];
                array[++i] = array[j];
                array[j] = temp;
            }
            ++j;
        }
        temp = array[i + 1];
        array[i + 1] = partition;
        array[end] = temp;
        return i + 1;
    }

    // 调整堆
    public static void adjustHeap(int[] array, int start, int end) {
        int max;
        int maxIndex;
        while (start * 2 + 1 <= end) {
            if ((2 * start + 2) <= end && array[2 * start + 1] < array[2 * start + 2]) {
                max = array[2 * start + 2];
                maxIndex = 2 * start + 2;
            } else {
                max = array[start * 2 + 1];
                maxIndex = start * 2 + 1;
            }
            if (max < array[start]) {
                break;
            }
            array[maxIndex] = array[start];
            array[start] = max;
            start = maxIndex;
        }
    }

    // 调整堆2
    public static void adjustHeap2(int[] array, int start, int end) {
        int l = 2 * start + 1;
        int r = 2 * start + 2;
        int maxIndex = 0;
        int max = 0;
        if (l <= end && array[l] > array[start]) {
            maxIndex = l;
        } else {
            maxIndex = start;
        }
        if (r <= end && array[r] > array[maxIndex]) {
            maxIndex = r;
        }
        if (maxIndex != start) {
            max = array[maxIndex];
            array[maxIndex] = array[start];
            array[start] = max;
            adjustHeap2(array, maxIndex, end);
        }
    }

    // 建堆
    public static void buildHeap(int[] array, int start, int end) {
        for (int index = (end + 1) / 2 - 1; index >= start; --index) {
            adjustHeap(array, index, end);
        }
    }

    // 建堆2
    public static void buildHeap2(int[] array, int start, int end) {
        for (int index = (end + 1) / 2 - 1; index >= start; --index) {
            adjustHeap2(array, index, end);
        }
    }

    // 堆排序
    public static void heapSort(int[] array, int start, int end) {
        startTime = new Date().getTime();
        buildHeap(array, start, end);
        int temp;
        for (int index = end; index > start; --index) {
            temp = array[start];
            array[start] = array[index];
            array[index] = temp;
            adjustHeap(array, start, index - 1);
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 堆排序2
    public static void heapSort2(int[] array, int start, int end) {
        startTime = new Date().getTime();
        buildHeap2(array, start, end);
        int temp;
        for (int index = end; index > start; --index) {
            temp = array[start];
            array[start] = array[index];
            array[index] = temp;
            adjustHeap2(array, start, index - 1);
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 并归排序
    public static void mergeSort(int[] array, int start, int end) {
        if (start == 0 && end == array.length - 1)
            startTime = new Date().getTime();
        if (start < end) {
            int s = (start + end) / 2;
            mergeSort(array, start, s);
            mergeSort(array, s + 1, end);
            merge(array, start, s, end);
        }
        if (start == 0 && end == array.length - 1) {
            endTime = new Date().getTime();
            System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        }
    }

    // 合并数组
    public static void merge(int[] array, int start, int s, int end) {
        int[] a = Arrays.copyOfRange(array, start, s + 1);
        int[] b = Arrays.copyOfRange(array, s + 1, end + 1);
        for (int k = start, i = 0, j = 0; k <= end; ++k) {
            if (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    array[k] = a[i++];
                } else {
                    array[k] = b[j++];
                }
            } else if (i == a.length && j < b.length) {
                array[k] = b[j++];
            } else if (j == b.length && i < a.length) {
                array[k] = a[i++];
            }
        }
    }

    // 计数排序
    public static int[] countSort(int[] array, int k) {
        startTime = new Date().getTime();
        int[] b = new int[array.length];
        int[] c = new int[k];
        for (int i = 0; i < k; ++i) {
            c[i] = 0;
        }
        for (int i = 0; i < array.length; ++i) {
            ++c[array[i]];
        }
        for (int i = 1; i < k; ++i) {
            c[i] += c[i - 1];
        }
        for (int i = array.length - 1; i >= 0; --i) {
            b[c[array[i]] - 1] = array[i];
            --c[array[i]];
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        return b;
    }

    /*
     * 基数排序 稳定的排序算法 array 代表数组 radix 代表基数 d 代表排序元素的位数
     */
    public static void radixSort(int[] array, int radix, int d) {
        startTime = new Date().getTime();
        // 临时数组
        int[] tempArray = new int[array.length];
        // count用于记录待排序元素的信息,用来表示该位是i的数的个数
        int[] count = new int[radix];

        int rate = 1;
        for (int i = 0; i < d; i++) {
            // 重置count数组，开始统计下一个关键字
            Arrays.fill(count, 0);
            // 将array中的元素完全复制到tempArray数组中
            System.arraycopy(array, 0, tempArray, 0, array.length);

            // 计算每个待排序数据的子关键字
            for (int j = 0; j < array.length; j++) {
                int subKey = (tempArray[j] / rate) % radix;
                count[subKey]++;
            }
            // 统计count数组的前j位（包含j）共有多少个数
            for (int j = 1; j < radix; j++) {
                count[j] = count[j] + count[j - 1];
            }
            // 按子关键字对指定的数据进行排序 ，因为开始是从前往后放，现在从后忘前读取，保证基数排序的稳定性
            for (int m = array.length - 1; m >= 0; m--) {
                int subKey = (tempArray[m] / rate) % radix;
                array[--count[subKey]] = tempArray[m]; // 插入到第--count[subKey]位，因为数组下标从0开始
            }
            rate *= radix;// 前进一位
        }
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
    }

    // 桶排序
    public static int[] bucketSort(int array[], int k) {
        startTime = new Date().getTime();
        double[] arrayTemp;
        arrayTemp = bucketHandleScope(array, k);
        int size = array.length;
        @SuppressWarnings("unchecked")
        List<Double>[] temp = new List[(int) Math.sqrt(size)];
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = new ArrayList<Double>();
        }
        for (int i = 0; i < size; ++i) {
            Collections.addAll(temp[(int) Math.floor((int) Math.sqrt(size) * arrayTemp[i])], arrayTemp[i]);
        }
        List<Double> result = new ArrayList<Double>();
        for (int i = 0; i < temp.length; ++i) {
            Collections.sort(temp[i]);
            result.addAll(temp[i]);
        }
        Object[] obj = result.toArray();
        endTime = new Date().getTime();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        return bucketHandleScopeAfter(obj, 1 / (double) k);
    }

    // 桶排序处理数组
    public static double[] bucketHandleScope(int array[], int k) {
        double[] arrayDouble = new double[array.length];
        for (int i = 0; i < array.length; ++i) {
            arrayDouble[i] = (double) array[i] / (double) k;
        }
        return arrayDouble;
    }
    // 桶排序后处理数组
    public static int[] bucketHandleScopeAfter(Object array[], double k) {
        int[] arrayDouble = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            arrayDouble[i] = (int) ((double) array[i] / k);
        }
        return arrayDouble;
    }
}

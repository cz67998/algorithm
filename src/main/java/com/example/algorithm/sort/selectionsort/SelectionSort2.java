package com.example.algorithm.sort.selectionsort;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/17
 * Time:12:30
 **/
// 在每一轮中, 可以同时找到当前未处理元素的最大值和最小值
public class SelectionSort2 {
    //我们的算法类不允许产生任何实例
    private SelectionSort2() {

    }

    public static void sort(Comparable[] arr) {
        int left = 0, right = arr.length;
        while (left < right) {
            int minIndex = left;
            int maxIndex = right;
            if (arr[minIndex].compareTo(arr[maxIndex]) > 0) {
                swap(arr, minIndex, maxIndex);
            }
            for (int i = left + 1; i < right; i++) {
                if (arr[i].compareTo(arr[minIndex]) < 0) {
                    minIndex = i;
                } else if (arr[i].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = i;
                }
            }
            swap(arr, left, minIndex);
            swap(arr, right, maxIndex);

            left++;
            right--;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

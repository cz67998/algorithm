package com.example.algorithm.sortadvance.quicksort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/21
 * Time:8:56
 **/
public class QuickSort1 {
    private QuickSort1(){

    }
    // 递归使用快速排序,对arr[left...right]的范围进行排序
    private static void sort(Comparable[] arr, int left, int right) {
        if (left >= right - 15) {
            insertSort(arr,left,right);
            return;
        }
        int p = parttion(arr, left, right);
        sort(arr, left, p - 1);
        sort(arr, p + 1, right);
    }

    // 对arr[l...r]部分进行partition操作
    // 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
    private static int parttion(Comparable[] arr, int left, int right) {
        Comparable v = arr[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(v) < 0) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, j, left);
        return j;
    }

    private static void insertSort(Comparable[] arr, int left, int right) {

        for (int i = left + 1; i <= right; i++) {
            Comparable e = arr[i];
            int j = i;
            for (; j > left && arr[j - 1].compareTo(e) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int j, int i) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort1", arr);

        return;
    }
}

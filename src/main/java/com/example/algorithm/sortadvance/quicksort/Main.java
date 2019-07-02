package com.example.algorithm.sortadvance.quicksort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/17
 * Time:12:20
 **/
public class Main {
    // 比较SelectionSort和InsertionSort两种排序算法的性能效率
    public static void main(String[] args) {

        int N = 20000;

        // 测试1 一般测试
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.mergesort.MergeSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort2Ways", arr2);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort3Ways", arr3);
        System.out.println();


        // 测试2 有序性更强的测试,有大量重复数据
        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr2, arr2.length);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.mergesort.MergeSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort2Ways", arr2);

        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort3Ways", arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println();


        // 测试3 测试近乎有序的数组
        int swapTimes = 100;
        System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr2, arr2.length);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.mergesort.MergeSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort2", arr2);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort3Ways", arr3);
        return;
    }
}

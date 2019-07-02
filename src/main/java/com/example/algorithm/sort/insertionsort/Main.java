package com.example.algorithm.sort.insertionsort;

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

        SortTestHelper.testSort("com.example.algorithm.sort.selectionsort.SelectionSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sort.insertionsort.InsertionSort", arr2);

        System.out.println();


        // 测试2 有序性更强的测试
        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
        arr2 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("com.example.algorithm.sort.selectionsort.SelectionSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sort.insertionsort.InsertionSort", arr2);

        System.out.println();


        // 测试3 测试近乎有序的数组
        int swapTimes = 100;
        System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
        arr2 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("com.example.algorithm.sort.selectionsort.SelectionSort", arr1);
        SortTestHelper.testSort("com.example.algorithm.sort.insertionsort.InsertionSort", arr2);

        return;
    }
}

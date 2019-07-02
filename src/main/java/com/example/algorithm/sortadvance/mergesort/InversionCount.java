package com.example.algorithm.sortadvance.mergesort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

import java.util.Arrays;

/**
 * 计算逆序
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/21
 * Time:15:52
 **/
public class InversionCount {
    private InversionCount() {
    }

    private static long merge(Comparable[] arr, int left, int mid, int right) {

        Comparable[] aux = Arrays.copyOfRange(arr, left, right+1);
        int i = left;
        int j = mid + 1;
        long res = 0L;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j - left];
                j++;
            } else if (j > right) {
                arr[k] = aux[i - left];
                i++;
            } else if (aux[i - left].compareTo(aux[j - left]) <= 0) {
                arr[k] = aux[i - left];
                i++;
            } else {
                arr[k] = aux[j - left];
                j++;
                // 此时, 因为右半部分k所指的元素小
                // 这个元素和左半部分的所有未处理的元素都构成了逆序数对
                // 左半部分此时未处理的元素个数为 mid - j + 1
                res += (long) (mid - i + 1);
                res += (mid - i + 1);
            }
        }
        return res;
    }

    private static long solve(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return 0L;
        }
        int mid = left + (right - left) / 2;
        long resL = solve(arr, left, mid);
        long redR = solve(arr, mid + 1, right);
        return redR + resL + merge(arr, left, mid, right);
    }

    public static long solve(Comparable[] arr) {

        return solve(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int N = 5;

        // 测试1: 测试随机数组
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        System.out.println("Test Inversion Count for Random Array, n = " + N + " :" + solve(arr));

        // 测试2: 测试完全有序的数组
        // 结果应该为0
        arr = SortTestHelper.generateOrderedArray(N);
        System.out.println("Test Inversion Count for Ordered Array, n = " + N + " :" + solve(arr));

        // 测试3: 测试完全逆序的数组
        // 结果应改为 N*(N-1)/2
        arr = SortTestHelper.generateInversedArray(N);
        System.out.println("Test Inversion Count for Inversed Array, n = " + N + " :" + solve(arr));


        return;
    }
}

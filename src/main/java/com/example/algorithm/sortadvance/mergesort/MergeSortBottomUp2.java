package com.example.algorithm.sortadvance.mergesort;

import com.example.algorithm.sort.insertionsort.InsertionSort;
import com.example.algorithm.sort.insertionsort.SortTestHelper;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/20
 * Time:13:45
 **/
public class MergeSortBottomUp2 {
    private MergeSortBottomUp2() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        // Merge Sort Bottom Up 优化
        // 对于小数组, 使用插入排序优化
        for (int i = 0; i < n; i += 16) {
            insertSort(arr, i, Math.min(i + 15, n - 1));
        }
        for (int size = 16; size < n; size *= 2) {
            for (int i = 0; i < n - size; i += size + size) {
                merge(arr, i, i + size - 1, Math.min(n - 1, i + size + size - 1));
            }
        }
    }

    private static void insertSort(Comparable[] arr, int left, int right) {

        for (int i = left + 1; i <= right; i++) {
            Comparable e = arr[i];
            int j = i;
            for (; j > 1 && arr[j - 1].compareTo(e) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    private static void merge(Comparable[] arr, int left, int mid, int right) {
        Comparable[] aux = Arrays.copyOfRange(arr, left, right + 1);
        int i = left;
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j - left];
                j++;
            } else if (j > right) {
                arr[k] = aux[i - left];
                i++;
            } else if (aux[i - left].compareTo(aux[j - left]) < 0) {
                arr[k] = aux[i - left];
                i++;
            } else {
                arr[k] = aux[j - left];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.mergesort.MergeSortBottomUp", arr);

    }
}

package com.example.algorithm.sortadvance.mergesort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/20
 * Time:9:11
 **/
public class MergeSort {
    private MergeSort() {

    }

    // 将arr[left...mid]和arr[mid+1...right]两部分进行归并
    private static void merge(Comparable[] arr, int left, int mid, int right) {
        Comparable[] aux = Arrays.copyOfRange(arr, left, right + 1);
        //初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int i = left, j = mid + 1;
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

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static void mergesort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
//        if(right-1<=15){
//            insertSort(arr);
//            return;
//        }
        int mid = left + (right - left) / 2;
        mergesort(arr, left, mid);
        mergesort(arr, mid + 1, right);
        //当需要归并在归并
        if(arr[mid].compareTo(arr[mid+1])>0)
        merge(arr, left, mid, right);
    }

    private static void insertSort(Comparable[] arr) {
      int n=arr.length;
        for (int i = 0; i < n; i++) {
            Comparable e=arr[i];
            int j=i;
            for(;j>0&&arr[j-1].compareTo(e)>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=e;
        }
    }

    public static void sort(Comparable[] arr) {
        mergesort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.example.algorithm.sortadvance.mergesort.MergeSort", arr);
    }
}

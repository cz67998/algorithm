package com.example.algorithm.sortadvance.quicksort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/21
 * Time:8:56
 **/
public class QuickSort3Ways {
    private QuickSort3Ways() {

    }

    // 递归使用快速排序,对arr[left...right]的范围进行排序
    private static void sort(Comparable[] arr, int left, int right) {
        if (left >= right - 15) {
            insertSort(arr, left, right);
            return;
        }
        swap(arr, left, (int) (Math.random() * (right - left + 1)) + left);
        Comparable v = arr[left];
        int lt=left;//arr[left+1...lt]<v
        int i=left+1;//arr[gt...r]>v
        int gt=right+1;//arr[lt+1..i]==v
        while (i<gt){
            if(arr[i].compareTo(v)<0){
                swap(arr, i,lt+1);
                i++;
                lt++;
            }else if(arr[i].compareTo(v)>0){
                swap(arr, gt-1,i );
                gt--;
            }else {
                i++;
            }
        }
        swap(arr, left, lt);
        sort(arr, left, lt - 1);
        sort(arr, gt, right);
    }


    public static void insertSort(Comparable[] arr, int left, int right) {

        for (int i = left+1 ; i <=right; i++) {
            Comparable e = arr[i];
            int j = i;
            for (; j > left && arr[j - 1].compareTo(e) > 0; j--)
                arr[j] = arr[j - 1];

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
//        int N = 1000000;
//        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 10);
//        SortTestHelper.testSort("com.example.algorithm.sortadvance.quicksort.QuickSort3Ways", arr);

        Comparable[] arr1 = new Comparable[]{5,3,4,5};
        insertSort(arr1,0,3);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        return;
        //   System.out.println((int)(Math.random()*10000)+1);


    }
}

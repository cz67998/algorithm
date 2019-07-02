package com.example.algorithm.sort.bubblesort;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/17
 * Time:15:28
 **/
public class BubbleSort2 {
    private BubbleSort2() {

    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        int newn = 0;
        do {
            newn = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                    newn++;
                }
            }
            n--;
        } while (newn > 0);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Comparable[] ints=new Comparable[]{5,4,3,2,1};
        BubbleSort2.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
//        int N = 20000;
//        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 100000);
//        SortTestHelper.testSort("com.example.algorithm.sort.bubblesort.BubbleSort", arr1);
    }
}

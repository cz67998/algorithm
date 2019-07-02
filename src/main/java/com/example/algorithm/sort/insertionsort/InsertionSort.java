package com.example.algorithm.sort.insertionsort;

/**
 * 插入排序
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:11:04
 **/
public class InsertionSort {
    //算法类不允许产生任何实例
    private InsertionSort() {
    }
    public void test(){

    }
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //1
//            for (int j = i; j > 0; j--) {
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }

            //2
//            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
//                swap(arr, j, j - 1);
//            }
             //3
            Comparable e=arr[i];
            int j=i;
            for(;j>0&&arr[j-1].compareTo(e)>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
//        int N = 20000;
//        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 100000);
//        SortTestHelper.testSort("com.example.algorithm.sort.insertionsort.InsertionSort", arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        Comparable[] arr=new Comparable[]{5,3,4,5,1};
        sort(arr);
                for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

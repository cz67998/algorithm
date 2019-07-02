package com.example.algorithm.sort.selectionsort;

import com.example.algorithm.sort.insertionsort.SortTestHelper;

/**
 * 选择排序
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:9:54
 **/
public class SelectionSort {
    //算法类不允许产生任何实例
    private SelectionSort() {

    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试Double
        Double[] b = {4.4, 3.3, 2.2, 1.1};
        SelectionSort.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试String
        String[] c = {"D", "C", "B", "A"};
        SelectionSort.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D", 90);
        d[1] = new Student("C", 100);
        d[2] = new Student("B", 95);
        d[3] = new Student("A", 95);
        SelectionSort.sort(d);
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);

        // 测试排序算法辅助函数
        int N = 20000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectionSort.sort( arr1 );
        SortTestHelper.printArray(arr1);


//        assert true;
//        System.out.println("断言1没有问题，Go！");
//        assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";
//        System.out.println("断言2没有问题，Go！");
    }
}

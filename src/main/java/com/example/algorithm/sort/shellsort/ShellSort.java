package com.example.algorithm.sort.shellsort;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/17
 * Time:16:15
 **/
public class ShellSort {
    private ShellSort() {

    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h>=1){
            for(int i=h;i<n;i++){
                Comparable e=arr[i];
                int j=i;
                for(;j>=h&&arr[j-h].compareTo(e)>0;j-=h){
                    arr[j]=arr[j-h];
                }
                arr[j]=e;
            }
            h/=3;
        }
    }

    public static void main(String[] args) {
        Comparable[] arr = new Comparable[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

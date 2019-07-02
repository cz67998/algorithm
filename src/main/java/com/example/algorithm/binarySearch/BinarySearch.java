package com.example.algorithm.binarySearch;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/1
 * Time:13:09
 **/
public class BinarySearch {
    public static int binarySearch(int[] arr, int k) {
        int a = 0;
        int b = arr.length;
        while (a < b) {
            int m =a+ (b-a) / 2;
            if ( arr[m]>k) {
                b = m;
            } else if ( arr[m]<k) {
                a = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println((1+3)/2);
        System.out.println(binarySearch(new int[]{1,2,10,15,100},15));
    }
}

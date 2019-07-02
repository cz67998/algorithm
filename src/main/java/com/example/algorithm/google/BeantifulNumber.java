package com.example.algorithm.google;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/10
 * Time:21:27
 **/
public class BeantifulNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = in.nextInt();
        //System.out.println("w"+cases);
        for (int i = 1; i <=cases; ++i) {
            long n = in.nextLong();
            System.out.println("Case #" + i + ": " + beautiful(n));
        }
    }

    private static long beautiful(long n) {
        for (long radix = 2; radix< n; radix++) {
            if (isBeautiful(n,radix)) {
                return radix;
            }
        }
        throw new IllegalStateException("should not reach here");
    }

    private static boolean isBeautiful(long n,long radix) {
        while (n > 0) {
            if(n%radix!=1){
                return false;
            }
            n/=radix;
        }
        return true;
    }
}

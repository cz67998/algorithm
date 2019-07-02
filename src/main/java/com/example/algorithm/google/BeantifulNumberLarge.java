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
public class BeantifulNumberLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = in.nextInt();
        //System.out.println("w"+cases);
        for (int i = 1; i <= cases; ++i) {
            long n = in.nextLong();
            System.out.println("Case #" + i + ": " + beautiful(n));
        }
    }

    /**
     * 获得满足要求的n
     * @param n
     * @return
     */
    private static long beautiful(long n) {
        for (int bits = 64; bits >= 2; bits--) {
            long radix = getRadix(bits, n);
            if (radix != -1) {
                return radix;
            }
        }
        throw new IllegalStateException("should not reach here");
    }

    /**
     * 获得满足要求的进制数
     * @param bits
     * @param n
     * @return
     */
    private static long getRadix(int bits, long n) {
        long minRadix = 2;
        long maxRadix = n;
        while (minRadix < maxRadix) {
            long m = minRadix + (maxRadix - minRadix) / 2;
            long t = convert(m, bits);
            if (n == t) {
                return m;
            } else if (n > t) {
                minRadix = m + 1;
            } else {
                maxRadix = m;
            }
        }
        return -1;
    }

    /**
     * 通过进制数radix和 1出现的此时，计算出n，通过二分查找比较，此值和n是否相等7
     * @param radix
     * @param bits
     * @return
     */
    private static long convert(long radix, int bits) {
        long component = 1;
        long sum = 0;
        for (int i = 0; i < bits; i++) {
            if (Long.MAX_VALUE - sum < component) {
                sum = Long.MAX_VALUE;
            } else {
                sum += component;
            }
           // System.out.println(component);
            if (Long.MAX_VALUE / component < radix) {
                component = Long.MAX_VALUE;
            } else {
                component *= radix;
            }
        }
        return sum;
    }
}

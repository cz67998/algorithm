package com.example.algorithm.google;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/11
 * Time:15:25
 **/
public class BeantifulNumberLargeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            long n = in.nextLong();
            System.out.println("Case #" + i + ": " + beautiful(n));
        }
    }

    private static long beautiful(long n) {
        for (int bits = 64; bits >= 2; bits--) {
            long rabix = getRabix(n, bits);
            if (rabix != -1) {
                return rabix;
            }
        }
        throw new IllegalStateException("should not reach here");
    }

    private static long getRabix(long n, int bits) {
        long min = 2;
        long max = n;
        while (min < max) {
            long m = min + (max - min) / 2;
            long t = convert(m, bits);
            if (t == n) {
                return m;
            } else if (t < n) {
                min = m + 1;
            } else {
                max = m;
            }
        }
        return -1;
    }

    private static long convert(long rabix, int bits) {
        long sum = 0;
        long compent = 1;
        for (int i = 0; i < bits; i++) {
            if (Long.MAX_VALUE - sum < compent) {
                sum = Long.MAX_VALUE;
            } else {
                sum += compent;
            }
            if (Long.MAX_VALUE / compent < rabix) {
                compent = Long.MAX_VALUE;
            } else {
                compent *= rabix;
            }

        }
        return sum;
    }
}

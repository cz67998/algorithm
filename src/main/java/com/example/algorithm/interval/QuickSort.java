package com.example.algorithm.interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/3
 * Time:14:43
 **/
public class QuickSort {
    public static List<Interval> quickSort(List<Interval> input, int start, int end) {
        if (input.size() < 1 || start < 0 || end >= input.size() || start > end) return null;
        int smallindex = partition(input, start, end);
        if (smallindex > start) quickSort(input, start, smallindex - 1);
        if (smallindex < end) quickSort(input, smallindex + 1, end);
        return input;
    }

    private static int partition(List<Interval> input, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(input, pivot, end);
        for (int i = start; i <= end; i++) {
            if (input.get(i).getLeft() <= input.get(end).getLeft()) {
                smallIndex++;
                if (i > smallIndex) swap(input, i, smallIndex);
            }
        }
        return smallIndex;
    }

    public static void swap(List<Interval> input, int i, int j) {
        Interval intervalTemp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, intervalTemp);
    }


}

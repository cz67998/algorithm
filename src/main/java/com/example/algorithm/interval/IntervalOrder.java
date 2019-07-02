package com.example.algorithm.interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/3
 * Time:14:31
 **/
public class IntervalOrder {
    public List<Interval> intervalOrder(List<Interval> input) {
        List<Interval> combineInterval = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (i == 0) {
                combineInterval.add(input.get(0));
            } else {
                Interval interval = input.get(i);
                if (interval.getRight() >= combineInterval.get(combineInterval.size() - 1).getRight()) {
                    if (interval.getLeft() <= combineInterval.get(combineInterval.size() - 1).getRight()) {
                        combineInterval.get(combineInterval.size() - 1).setRight(interval.getRight());
                    } else {
                        combineInterval.add(input.get(i));
                    }

                }
            }
        }
        return combineInterval;
    }

    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 2);
        Interval interval2 = new Interval(4, 6);
        Interval interval3 = new Interval(3, 6);
        Interval interval4 = new Interval(9, 10);
        Interval interval5 = new Interval(8, 17);
        List<Interval> input = new ArrayList<>();
        input.add(interval1);
        input.add(interval2);
        input.add(interval3);
        input.add(interval4);
        input.add(interval5);
        System.out.println(QuickSort.quickSort(input, 0, input.size() - 1));
        IntervalOrder intervalOrder = new IntervalOrder();
        System.out.println(intervalOrder.intervalOrder(QuickSort.quickSort(input, 0, input.size() - 1)));
    }
}

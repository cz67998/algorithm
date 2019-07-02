package com.example.algorithm.recursive;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/3/17
 * Time:13:39
 **/
public class Example2 {
    public void combination(List<Integer> selected, List<Integer> data, int n) {
        if (n == 0) {
            for (Integer i : selected) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if (data.isEmpty()) {
            return;
        }
        if(data.size()<n){
            return;
        }
        //取第一个
        //  System.out.println(data.get(0)+"data.get(0)");
        selected.add(data.get(0));
        // System.out.println(data.subList(1, data.size())+"111111");
        combination(selected, data.subList(1, data.size()), n - 1);
        //   System.out.println(data.subList(1, data.size())+"222222");

        //排除第一个

        //System.out.println(selected.get(selected.size() - 1)+"selected.get(selected.size() - 1)");
        selected.remove(selected.size() - 1);

        combination(selected, data.subList(1, data.size()), n);
    }


    public void comb(List<Integer> selected, List<Integer> data, int n) {

        if (n == 0) {
            for (Integer i : selected) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if (data.isEmpty()) {
            return;
        }
        selected.add(data.get(0));
        comb(selected, data.subList(1, data.size()), n - 1);
        System.out.println(selected.remove(selected.size() - 1));

        comb(selected, data.subList(1, data.size()), n);
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.comb(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 2);
    }
}
package com.example.algorithm.sort.selectionsort;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/15
 * Time:10:29
 **/
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score<o.score){
            return -1;
        }else if(this.score<o.score){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {

        return this.name+"："+this.score;
    }
}

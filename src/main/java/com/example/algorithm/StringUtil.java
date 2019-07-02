package com.example.algorithm;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/6/4
 * Time:13:02
 **/
public class StringUtil {
    private StringUtil() {

    }

    public static String[] sonString(String str) {
        int n = str.length();
        String[] strings = new String[n * n];
        int j = 0;
        for (int i = 0; i <= n; i++) {
            for (int i1 = 0; i1 <= n; i1++) {
                //   System.out.println(i+"::"+i1+".."+n);
                if (i1 > i) {
                    // System.out.println(i+":::"+i1);
                    strings[j++] = str.substring(i, i1);

                }
            }
        }
        return strings;
    }
    //计算x的n次方
    static double pow(double x,int n){
        assert n>=0;
        if(n==0)return 1.0;
        double t=pow(x,n/2);
        if(n%2!=0)return x*t*t;
        return t*t;
    }

    public static void main(String[] args) {
        System.out.println(StringUtil.pow(2.0,3 ));
//        String[] strings = StringUtil.sonString("abc");
//        for (int i = 0; i < strings.length && strings[i] != null; i++) {
//            System.out.println(strings[i]);
//        }
//        String str="abc";
//        System.out.println(str.substring(0,1 ));
//        System.out.println(str.substring(0,2 ));
//        System.out.println(str.substring(0,3 ));
//        System.out.println(str.substring(1,2 ));
    }
}

package com.example.algorithm.sortadvance.quicksort;

/**
 * 查找第几大的元素
 * Created by IDEA
 * author:wangzhou
 * Date:2019/5/21
 * Time:17:25
 **/
public class Selection {
    private Selection() {

    }

    private static int parttion(Comparable[] arr, int left, int right) {
        swap(arr, left, (int) (Math.random() * (right - left)) + 1);
        Comparable e = arr[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(e) < 0) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr,left ,j );
        return j;
    }
    private static Comparable solve(Comparable[] arr,int left,int right,int k){
        if(left==right){
            return arr[left];
        }
        int p=parttion(arr,left ,right );
        if(k==p){
            return arr[p];
        }else if(k<p){
            return solve(arr,left ,p-1 ,k );
        }else {
            return solve(arr,p+1 ,right ,k );
        }
    }

    // 寻找nums数组中第k小的元素
    // 注意: 在我们的算法中, k是从0开始索引的, 即最小的元素是第0小元素, 以此类推
    // 如果希望我们的算法中k的语意是从1开始的, 只需要在整个逻辑开始进行k--即可, 可以参考solve2
    public static Comparable solve(Comparable nums[], int k) {

        assert nums != null && k >= 0 && k < nums.length;
        return solve(nums, 0, nums.length - 1, k);
    }
    // 寻找nums数组中第k小的元素, k从1开始索引, 即最小元素是第1小元素, 以此类推
    public static Comparable solve2(Comparable nums[], int k) {

        return Selection.solve(nums, k - 1);
    }
    private static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        // 生成一个大小为n, 包含0...n-1这n个元素的随机数组arr
        int N = 10000;
        Integer[] arr = TestHelper.generateOrderedArray(N);
        TestHelper.shuffleArray(arr);

        // 验证Selection.solve, 对arr数组求第i小元素, 应该为i
        for( int i = 0 ; i < N ; i ++ ){
            assert solve(arr, i) .compareTo(i)==0 ;
            System.out.println("test " + i + " complete."+solve(arr, i));
        }
        System.out.println("Test Selection.solve completed.");
        System.out.println();


        arr = TestHelper.generateOrderedArray(N);
        TestHelper.shuffleArray(arr);

        // 验证Selection.solve2, 对arr数组求第i小元素, 应该为i-1
        // 因为在Selection.solve2中, 第k小元素的k是从1索引的
        for( int i = 0 ; i < N ; i ++ ){
            assert solve2(arr, i) .compareTo(i - 1)==0;
            System.out.println("test " + i + " complete."+solve2(arr, i));
        }
        System.out.println("Test Selection.solve2 completed.");
    }
}

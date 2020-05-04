package com.pwnpub.algorithm;

/**
 * @author Giannis
 * @date 2020-04-03 17:35
 * @desc
 */
public class SelectionSort_ex {

    // 我们的算法类不允许产生任何实例
    private SelectionSort_ex(){}

    public static void sort(int[] arr){

        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ )
                if( arr[j] < arr[minIndex] )
                    minIndex = j;

            swap( arr , i , minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] arr = {1,9,10,8,7,6,5,4,3,2};
        SelectionSort_ex.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

}

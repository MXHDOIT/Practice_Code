package com.xpu.sort;

import java.util.Arrays;
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53,3,542,748,14,214};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr){

        //定义十个桶
        int[][] bucket = new int[10][arr.length];

        //为了记录每个桶中，实际放了多少个数据
        int[] bucketElementCounts = new int[10];

        //选出最大的数已确定循环的次数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int size = (max+"").length();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j]/(int)Math.pow((int)10,(int)i)%10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            int index = 0;
            for(int k = 0;k < 10;k++){
                if(bucketElementCounts[k]!=0){
                    for(int l = 0;l < bucketElementCounts[k];l++){
                        arr[index++]=bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }
        }
    }
}

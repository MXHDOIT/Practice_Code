package com.xpu.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,20};

        System.out.print("排序前：");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.print("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
        int len = arr.length;

        for(int i = 0;i < len-1;i++){ //排序len-1
            int min = arr[i];
            int k = i;
            for(int j = i+1;j < len;j++){
                if(min > arr[j]){
                    min = arr[j];
                    k = j;
                }
            }
            arr[k] = arr[i];
            arr[i] = min;
        }
    }
}

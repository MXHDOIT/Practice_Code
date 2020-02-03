package com.xpu.sort;

import java.util.Arrays;

public class InsertSelect {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,20};

        System.out.print("排序前：");
        System.out.println(Arrays.toString(arr));
        insertSelect(arr);
        System.out.print("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSelect(int[] arr){
        for(int i = 1;i < arr.length;i++){
            int temp = arr[i];
            int k = i;
            for(int j = i-1; j >= 0;j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                    k = j;
                }
            }
            arr[k] = temp;
        }
    }
}

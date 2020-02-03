package com.xpu.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,20};

        System.out.print("排序前：");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.print("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        //冒泡排序 的时间复杂度O(n^2)
        int temp = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0;j < arr.length-1-i; j++){
                //如果前面的数比后面的数大，则交换
                if(arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){ //在一次排序中，没有发生交换
                break;
            }else{
                flag = false;
            }
        }
    }
}

import java.util.Arrays;

public class MostNum {
    public static void main(String[] args){
        int[] arr = {64,45,23,98,9,5,32,323};
        int max = maxNum(arr);
        int min = minNum(arr);
        int ave = aveNum(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(ave);
//
//        System.out.println(Arrays.toString(arr));
//        reverseNum(arr);
//        System.out.println(Arrays.toString(arr));
//        newNum(arr);
//        System.out.println(Arrays.toString(arr));
    }





    public static int maxNum(int[] arr){
        int max = arr[0];
        for(int x:arr){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    public static int minNum(int[] arr){
        int min = arr[0];
        for(int x:arr){
            if(x < min){
                min = x;
            }
        }
        return min;
    }

    public static int aveNum(int[] arr){
        int sum = 0;
        for(int x:arr){
           sum+=x;
        }
        return sum/arr.length;
    }

    public static void reverseNum(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }

    public static void newNum(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            while (arr[left]%2 == 1 && left<right){
                left++;
            }
            while (arr[right]%2 == 0 && left<right){
                right--;
            }

            if( left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}

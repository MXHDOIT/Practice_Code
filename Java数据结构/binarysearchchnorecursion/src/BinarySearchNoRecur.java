/**
 * 算法一：二分查找非递归
 */
public class BinarySearchNoRecur {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,9};
        System.out.println(binarySearch(arr,6));
    }

    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid+1;
            }else{ //arr[mid] > target
                right = mid-1;
            }
        }

        return -1;
    }
}

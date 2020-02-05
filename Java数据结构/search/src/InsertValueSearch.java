import java.util.Arrays;
public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for(int i = 0;i < arr.length;i++){
            arr[i] = i+1;
        }

        int i = insertValueSearch(arr, 0, arr.length - 1, 7);
        System.out.println(i);
//        System.out.println(Arrays.toString(arr));
    }

    public static int insertValueSearch(int[] arr,int left,int right,int target){
        if(left > right || target < arr[0] || target > arr[right]){
            return -1;
        }

        int mid = left+(right - left)*(target - arr[left])/(arr[right] - arr[left]);
        int midVal= arr[mid];
        if(target > midVal){
            return insertValueSearch(arr,mid+1,right,target);
        }else if(target < midVal){
            return insertValueSearch(arr,left,mid-1,target);
        }else{
            return mid;
        }
    }
}

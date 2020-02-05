import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8};
        System.out.println(binarySearch2(arr,0,arr.length-1,6));
    }

    public static int binarySearch(int[] arr,int start,int end,int target){
        int mid = (start+end)/2;
        int num = -1;
        if(end < start){
            return -1;
        }
        if(arr[mid] == target){
            num = mid;
        }else if(arr[mid] > target){
            num = binarySearch(arr,start,mid-1,target);
        }else if(arr[mid] < target){
            num = binarySearch(arr,mid+1,end,target);
        }
        return num;
    }

    public static ArrayList<Integer> binarySearch2(int[] arr, int start, int end, int target){
        int mid = (start+end)/2;
        if(end < start){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[mid] == target){
            int temp = mid -1;
            while(true){
                if(temp<0 || arr[temp]!=target){
                    break;
                }
                list.add(temp);
                temp--;
            }

            list.add(mid);

            temp = mid +1;
            while (true){
                if(temp > arr.length-1 || arr[temp] != target){
                    break;
                }

                list.add(temp);
                temp++;
            }

            return list;
        }else if(arr[mid] > target){
            return binarySearch2(arr,start,mid-1,target);
        }else{
            return binarySearch2(arr,mid+1,end,target);
        }
    }
}

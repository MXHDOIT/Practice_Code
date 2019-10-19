import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(a);
        System.out.println(findNum(a,0,a.length,8));
    }

    public static int findNum(int[] a,int left, int right,int key){
        if(left > right){
            return -1;
        }

        int mid = (left+right)/2;

        if(a[mid] == key){
            return mid;
        }else if(a[mid] < key){
            return findNum(a,mid+1,right,key);
        }else{
            return findNum(a,left,mid-1,key);
        }
    }
}

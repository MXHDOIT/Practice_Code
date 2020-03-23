import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        int mid = left;
        
        while(array[left] >= array[right]){
            if(right - left == 1){
                mid = right;
                break;
            }
            
            mid = left + (right-left)/2;
            if(array[mid] >= array[left]){
                left = mid;
            }
            if(array[mid] < array[left]){
                right = mid;
            }
        }
        
        return array[mid];
    }
}
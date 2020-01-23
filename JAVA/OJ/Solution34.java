class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if(nums.length == 0){
            return res;
        }
        int mid = findMid(nums,target);
        int start = mid;
        int end = mid;
        while(start > 0){
            if(nums[start-1] == target){
                start = start-1;
            }else{
                break;
            }
        }

        while(end < nums.length-1){
            if(nums[end+1] == target){
                end = end+1;
            }else{
                break;
            }
        }
        return new int[]{start,end};
    }

   public int findMid(int[] nums,int target){
       int left = 0;
       int right = nums.length-1;
       int mid = 0;

       while(left <= right){
           mid = (left+right)/2;
           if(nums[mid]== target){
               return mid;
           }else if(nums[mid] > target){
               right = mid-1;
           }else if(nums[mid] < target){
               left = mid+1;
           }
       }

       return -1;
   }
}  
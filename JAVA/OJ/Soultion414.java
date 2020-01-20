class Solution {
    public int thirdMax(int[] nums) {
     Arrays.sort(nums);
     int j = 1;

     for(int i = 1;i < nums.length;i++){
        if(nums[i] != nums[i-1]){
            nums[j++] = nums[i];
        }
     }
     if(j < 3){
         return nums[j-1];
     }else{
         return nums[j-3];
     }
    }
}
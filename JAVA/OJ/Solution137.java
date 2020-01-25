//只出现一次的数字 II
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;

        for( i= 0;i < nums.length-2;i += 3){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
            }else{
               break;
            }
        }

         return nums[i];
    }
}
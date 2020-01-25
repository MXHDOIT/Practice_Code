class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // int len = nums.length;
        // int num = len/2;
        // for(int i = 0 ;i < len-num;i++){
        //     if(nums[i] == nums[i+num]){
        //         return nums[i];
        //     }
        // }
        // return 0;
        return nums[(nums.length-1)/2];
    }
}
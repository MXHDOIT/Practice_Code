class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = -1;
        int right = -1;
        boolean flag = false;
        for(int i = 0;i < nums.length-1;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i]>nums[j]){
                    left = i;
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }
        flag = false;
        for(int i = nums.length-1;i > 0;i--){
            for(int j=i-1;j >= 0;j--){
                if(nums[i]<nums[j]){
                    right = i;
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }

        if(left != -1&&right != -1){
            return right-left+1;
        }else{
            return 0;
        }
    }
}
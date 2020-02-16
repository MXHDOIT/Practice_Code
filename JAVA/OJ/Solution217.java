class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length;i++){
            Integer num = map.get(nums[i]);
            if(num != null){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
}
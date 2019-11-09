// 最后一块石头的重量
class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        
        int len = stones.length;
        while(len > 1){
            if(stones[len-1] == stones[len -2]){
                len = len -2;
            }else{
                stones[len-2] = stones[len-1] - stones[len-2];
                len--;
            }
            Arrays.sort(stones);
        }
        if(len == 1){
            return stones[0];
        }else{
            return 0;
        }
    }
}
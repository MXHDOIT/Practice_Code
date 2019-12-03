class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int res = 0;

        for(int i = prices.length-1;i >= 0;i--){
            if(prices[i] > max){
                max = prices[i];
            }
            if(max - prices[i] > res){
                res = max-prices[i];
            }
        }


        return res;
    }
}
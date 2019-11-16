class Solution {
    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length;
        int max= 0;
        int count = 0;
        while(head < tail){
            if(height[head] < height[tail]){
                count = height[head]*(tail-head);
                head++;
            }else{
                count = height[tail]*(tail-head);
                tail--;
            }

            if(count>max){
                max = count;
            }
        }
        return max;
    }
}

//双指针
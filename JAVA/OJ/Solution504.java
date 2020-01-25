class Solution {
    public String convertToBase7(int num) {
        int sum = 0;

        int nums = Math.abs(num);
        int count = 1;


        while(nums > 0){
            sum += (nums%7)*count;
            nums /= 7;
            count *= 10;
        }

        if(num<0){
            return "-"+sum;
        }else{
            return sum+"";
        }
    }
}
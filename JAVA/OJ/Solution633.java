class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        int b = 0;

        while(b <= n){
            int num = b*b+n*n;

            if(num == c){
                return true;
            }else if(num > c){
                n--;
            }else{
                b++;
            }
        }

        return false;
    }
}
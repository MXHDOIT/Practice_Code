public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int num = 0;
        for(int i = 0; i < 32; i++){
            int res = n&1;

            num += (res<<(31-i));
            n>>=1;
        }

        return num;
    }
}
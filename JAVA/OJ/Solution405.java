//数字转换问十六进制
class Solution {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        StringBuilder str = new StringBuilder();

        while(str.length()<8 && num!=0){
            str.append(arr[num & 0xf]);
            num >>= 4;
        }

        return str.reverse().toString();
    }
}
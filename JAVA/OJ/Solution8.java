class Solution {
    public int myAtoi(String str) {
        if(str.length()==0||str ==null){
            return 0;
        }
        str = str.trim();
        int i = 0; //用于全局索引
        int flag = 1; //用于符号位
        if(str.length()==0||str ==null){
            return 0;
        }
        //确定正负数
        char headCh = str.charAt(i);
        if(headCh == '+'){
            i++;
        }else if(headCh == '-'){
            i++;
            flag = -1;
        }else if(headCh < '0' || headCh >'9'){
            return 0;
        }
        int res = 0; //记录最终的数
        for(int j = i;j < str.length();j++){
            char ch = str.charAt(j);
            if(ch <'0' || ch >'9'){
                break;
            }else{
                res = res*10 + (ch-48);
                if(flag>0 && j+1<str.length() && str.charAt(j+1)>='0' && str.charAt(j+1)<='9' && res > Integer.MAX_VALUE/10)
                return Integer.MAX_VALUE;
            if(flag>0 && j+1<str.length() && str.charAt(j+1)>='0' && str.charAt(j+1)<='9' && res == Integer.MAX_VALUE/10 && str.charAt(j+1)-'0' > Integer.MAX_VALUE%10)
                return Integer.MAX_VALUE;
            if(flag<0 && j+1<str.length() && str.charAt(j+1)>='0' && str.charAt(j+1)<='9' && -res < Integer.MIN_VALUE/10)
                return Integer.MIN_VALUE;
            if(flag<0 && j+1<str.length() && str.charAt(j+1)>='0' && str.charAt(j+1)<='9' && -res == Integer.MIN_VALUE/10 && -(str.charAt(j+1)-'0') < Integer.MIN_VALUE%10)
                return Integer.MIN_VALUE;

            }
        }
        return res*flag;
    }
}
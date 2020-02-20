class Solution {
    public String addBinary(String a, String b) {
        if(a==null||a.length() == 0)
           return b;
        if(b==null||b.length() == 0)
            return a;

        //代表ab的最大索引
        int alen = a.length()-1;
        int blen = b.length()-1;
        int c = 0; //用来标志进位
        StringBuilder str = new StringBuilder();//最后结果
        while(alen >= 0||blen >= 0){
            if(alen >= 0)
                c += (int)a.charAt(alen--)-'0';
            if(blen >= 0)
                c += (int)b.charAt(blen--)-'0';
            str.append(c%2);
            c >>= 1; //进位
        }

        String res = str.reverse().toString();
        return c>0?'1'+res:res;

    }
}
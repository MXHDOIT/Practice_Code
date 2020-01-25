//验证回文串
class Solution {
    public boolean isPalindrome(String s) {
          char[] chars = s.toCharArray();

        StringBuffer sb = new StringBuffer();

        for(char x:chars){
            if((x >= '0'&&x <='9')||(x>='a'&&x<='z')||(x>='A'&&x<='Z')){
                sb.append(x);
            }
        }
        String str = sb.toString();

        sb.reverse();
//        System.out.println(str);
//        System.out.println(sb);
        if(str.equalsIgnoreCase(sb.toString())){
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                if(!palindrome(s.substring(i,j))&&!palindrome(s.substring(i+1,j+1))){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    
    }

    public boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
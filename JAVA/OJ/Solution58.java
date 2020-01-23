class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        if(s == null){
            return 0;
        }
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();
    }
}
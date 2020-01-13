class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder stringBuilder = new StringBuilder(magazine);

        int index;
        for(char c:ransomNote.toCharArray()){
            index = stringBuilder.indexOf(String.valueOf(c));
            if(index >= 0){
                stringBuilder.deleteCharAt(index);
            }else{
                return false;
            }
        }
        return true;
    }
}
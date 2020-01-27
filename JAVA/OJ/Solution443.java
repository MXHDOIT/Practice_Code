
class Solution {
    public int compress(char[] chars) {
      String str = "";
      int count = 1;
      for(int i = 0;i < chars.length;i++){
          if(i == chars.length-1 || chars[i] != chars[i+1]){
              str += chars[i];
              if(count != 1){
                  str += count; 
                  count = 1;
              }
          }else{
              count++;
          }
      }

     char[] chares  =  str.toCharArray();
    System.arraycopy(chares,0,chars,0,chares.length);
     return chares.length;
    }
}
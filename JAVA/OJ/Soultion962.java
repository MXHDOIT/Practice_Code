class Solution {
  public static int  maxWidthRamp(int[] A) {
    int maxLen = 0;

    for(int i = 0;i < A.length-1;i++){
        for(int j = A.length-1;j > i;j--){
            if(j-i < maxLen){
                break;
            }
            if(A[j] >= A[i]){
                maxLen = j-i;
                break;
            }
        }
    }  
    return maxLen;
  }
}
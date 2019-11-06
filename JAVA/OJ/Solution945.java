class Solution {
    public int minIncrementForUnique(int[] A) {
         Arrays.sort(A);
        int count =0;
        for(int i = 1;i < A.length;i++){
            if(A[i-1] <= A[i]){
                count += A[i-1] - A[i]+1;
                A[i]=A[i-1]+1;
            }
        }
        return count;
    }
}
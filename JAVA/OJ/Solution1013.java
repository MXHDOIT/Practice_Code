class Solution {

    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;

        for(int x:A){

            sum += x;

        }




        int num = sum/3;




        int count = 0;

        int midNum = 0;

        for(int i = 0;i < A.length;i++){

            midNum += A[i];

            if(midNum == num){

                midNum = 0;

                count++;

            }

        }




        if(midNum == 0 && count == 3){

            return true;

        }else{

            return false;

        }

    }

}

class Solution {

    public int findJudge(int N, int[][] trust) {

        if(N == 1){

            return 1;

        }

        int[] arr = new int[N+1];




        for(int i = 0;i < trust.length;i++){

            arr[trust[i][1]]++;    //信任的人数

        }




        for(int i = 0;i < arr.length;i++){

            if(arr[i] == N-1){

                for(int j = 0;j < trust.length;j++){

                    if(trust[j][0] == i){

                        return -1;

                    }

                }

                 return i;

            }

        }

        return -1;

    }

}
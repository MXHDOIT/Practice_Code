import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[][] findContinuousSequence(int target) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1;i <= target/2;i++){
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for(int k = i;count < target;k++){
                count += k;
                list.add(k);
            }
            if(count == target){
                res.add(list);
            }
        }

        int[][] resArr = new int[res.size()][];
        for(int i = 0;i < res.size();i++){
            resArr[i] = new int[res.get(i).size()];
        }

        for(int i = 0;i < resArr.length;i++){
            for(int j = 0;j < resArr[i].length;j++){
                resArr[i][j] = res.get(i).get(j);
            }
        }

        return resArr;
    }

    public static void main(String[] args) {
        findContinuousSequence(9);
    }
}
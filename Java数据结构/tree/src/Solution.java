import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(printMatrix(array));
    }

    public static ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length < 1){
            return result;
        }
        int down = array.length;
        int right = array[0].length;
        if(right < 1){
            return result;
        }

        int layer = (Math.min(right,down)-1)/2+1;
        for(int i = 0;i < layer;i++){
            for(int c = i;c < right-i;c++){
                result.add(array[i][c]);
            }
            for(int r = i+1;r < down-i;r++){
                result.add(array[r][right-i-1]);
            }
            for(int c = right-2-i;(c>=i)&&(down-i-1 != i);c--){ //down-i-1 != i判断是否在一行
                result.add(array[down-i-1][c]);
            }
            for(int r = down-2-i; (r>i)&&(right-i-1 != i);r--){
                result.add(array[r][i]);
            }
        }
        return result;
    }
}

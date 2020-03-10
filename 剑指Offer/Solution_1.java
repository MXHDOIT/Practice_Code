public class Solution_1 {
    public boolean Find(int target, int [][] array) {
        int len = array.length;
        int lenN = array[0].length;
        
        int i = 0;
        int j = lenN-1;
        
        while(i < len&&j >= 0){
            if(target < array[i][j]){
                j--;
            }else if(target > array[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
public class Solution_01 {

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        return judge(sequence,0,sequence.length-1);
    }

    public static boolean judge(int [] sequence,int left,int right){
        if(left >= right){
            return true;
        }

        int root = sequence[right];
        int index = 0;
        for(int i = left;i <= right;i++){
            if(sequence[i] >= root){
                index = i;
                break;
            }
        }

        for(int i = index;i < right;i++){
            if(sequence[i] < root){
                return false;
            }
        }

        return judge(sequence,left,index-1)&&judge(sequence,index,right-1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1,2,5,8,7,4};
        System.out.println(VerifySquenceOfBST(arr));
    }

}

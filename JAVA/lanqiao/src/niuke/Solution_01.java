package niuke;

public class Solution_01 {
	
	 	public static boolean VerifySquenceOfBST(int [] sequence) {
	        return judge(sequence,0,sequence.length);
	    }
	    
	    public static boolean judge(int [] sequence,int left,int right){
	        if(left >= right){
	            return true;
	        }
	        
	        int root = sequence[right];
	        int index = 0;
	        for(index = left;index <= right;index++){
	            if(sequence[index] >= root){
	                break;
	            }
	        }
	        
	        for(;index < right;index++){
	            if(sequence[index] < root){
	                return false;
	            }
	        }
	        
	        return judge(sequence,left,index-1)&&judge(sequence,index,right-1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,6,12,16,14,10};
		VerifySquenceOfBST(arr);
	}

}

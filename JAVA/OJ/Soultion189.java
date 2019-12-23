
public class OJ_189 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        rotate(nums,2);
    }

    public static void rotate(int[] nums,int k){
        int len = nums.length;
        k = k%len;
        reverseArray(nums,0,len-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,len-1);

//        System.out.println(nums.toString());
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void reverseArray(int[] nums, int i, int i1) {
        int left = i;
        int right = i1;

        while(left < right){
            int tem = nums[left];
            nums[left] = nums[right];
            nums[right] = tem;
            left++;
            right--;
        }
    }
}
